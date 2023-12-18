const val P = 1000000007L

class FiniteField(xRaw: Long) {
  val x = if (xRaw >= 0) xRaw % P else (P - ((-xRaw) % P)) % P
  constructor(xi: Int): this(xi.toLong())
  operator fun plus(o: Long) = FiniteField((x + o) % P)
  operator fun plus(o: FiniteField) = this + o.x
  operator fun minus(o: Long) = FiniteField((x + P - o) % P)
  operator fun minus(o: FiniteField) = this - o.x
  operator fun times(o: Long) = FiniteField((x * o) % P)
  operator fun times(o: FiniteField) = this * o.x
  override fun toString() = x.toString()
}

fun powerOfTwo(p: Int): FiniteField {
  if (p == 0) return FiniteField(1)
  val a = powerOfTwo(p / 2)
  return a * a * if (p % 2 == 1) FiniteField(2) else FiniteField(1)
}

fun solve(hs: List<Int>): Pair<FiniteField, FiniteField> {
  // println(hs)
  val hMin = hs.min()!!
  if (hs.all { it == hMin }) {
    val w = hs.size
    val v1 = powerOfTwo(w) + powerOfTwo(hMin) - 2
    val v2 = powerOfTwo(hMin)
    return Pair(v1, v2)
  } else {
    // Fill this.
    val r = hs.count { it == hMin }

    var p1 = FiniteField(1)
    var p2 = FiniteField(1)
    val childHs = mutableListOf<Int>()
    for (h in hs) {
      if (h == hMin) {
        if (childHs.size > 0) {
          val (c1, c2) = solve(childHs)
          p1 *= c1 + c2
          p2 *= c2
          childHs.clear()
        }
      } else {
        childHs.add(h - hMin)
      }
    }
    if (childHs.size > 0) {
      val (c1, c2) = solve(childHs)
      p1 *= c1 + c2
      p2 *= c2
      childHs.clear()
    }

    val v1 = p1 * powerOfTwo(r) + (powerOfTwo(hMin) - 2) * p2
    val v2 = powerOfTwo(hMin) * p2
    return Pair(v1, v2)
  }
}

fun main(args: Array<String>) {
  val n = readLine()!!.toInt()
  val hs = readLine()!!.split(" ").map { it.toInt() }
  println(solve(hs).first)
}
