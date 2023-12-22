import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System."in")
    val DICE: Int = 6
    var dice: Array<Int?> = arrayOfNulls(DICE)
    var dice2: Array<Int?> = arrayOfNulls(DICE)
    var word: String = "A"
    
    for (i in 0 until DICE) {
        dice[i] = scan.nextInt()
    }
    
    var direction = scan.next()
   
    for (i in 0 until direction.length){
        word = direction.substring(i,i)
        when (word) {
            "N" -> dice2[0] = dice[1]
			"N"	-> dice2[1] = dice[5]
			"N"	-> dice2[2] = dice[2]
			"N"	-> dice2[3] = dice[3]
			"N"	-> dice2[4] = dice[0]
			"N"	-> dice2[5] = dice[4]
			"E" -> dice2[0] = dice[3]
			"E"	-> dice2[1] = dice[1]
			"E"	-> dice2[2] = dice[0]
			"E"	-> dice2[3] = dice[5]
			"E"	-> dice2[4] = dice[4]
			"E"	-> dice2[5] = dice[2]
			"S" -> dice2[0] = dice[4]
			"S"	-> dice2[1] = dice[0]
			"S"	-> dice2[2] = dice[2]
			"S"	-> dice2[3] = dice[3]
			"S"	-> dice2[4] = dice[5]
			"S"	-> dice2[5] = dice[1]
	        "W" -> dice2[0] = dice[2]
			"W"	-> dice2[1] = dice[1]
			"W"	-> dice2[2] = dice[5]
			"W"	-> dice2[3] = dice[0]
			"W"	-> dice2[4] = dice[4]
			"W"	-> dice2[5] = dice[3]
        }
        
        dice2 = dice
    }
    scan.close()
    println(dice[0])
}
