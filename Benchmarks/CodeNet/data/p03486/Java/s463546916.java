using System;
using System.Text;
using System.Collections.Generic;

class Program
{
    const int MOD = (int)1e9 + 7;
    // const int MOD = (int) 998244353;
    const int INT_MAX = 2147483647;

    static void Main(string[] args)
    {
        string s = Scan.Strln();
        string t = Scan.Strln();
        char[] a = s.ToCharArray();
        char[] b = t.ToCharArray();
        Array.Sort(a);
        Array.Sort(b);
        Array.Reverse(b);
        string _s = new string(a);
        string _t = new string(b);
        bool f = _s.CompareTo(_t) == -1;
        Out.YesNo(f);
    }
}

public class Algo
{
    public const long MOD = (long)1e9 + 7;

    public static void F_field_SimulEqus(long[,] ar, int mod)
    {
        // modは素数と考えて良さそうなのでフェルマーの小定理を利用する
        for (int k = 0; k < ar.GetLength(0); k++)
        {
            // [k,k]を1にして[else,k]を0にしたいので,(ar[k,k]-2)乗する
            
            // その前に0なら入れ替える
            if(ar[k,k] == 0 && k != ar.GetLength(0) - 1)
            {
                for (int l = 0; l < ar.GetLength(1); l++)
                {
                    // 各項の入れ替えを行う
                    long tmp = ar[k, l];
                    ar[k, l] = ar[(k + 1) % k, l];
                    ar[(k + 1) % k, l] = tmp;
                }
            }
            else
            {
                long inv = (long)Math.Pow(ar[k, k], mod - 2);
                for (int l = 0; l < ar.GetLength(1); l++)
                {
                    // mod-2乗して考える(遅いので繰り返し二乗法に書き直す)
                    ar[k, l] = (long)(ar[k, l] * (inv % mod)) % mod;
                }
            }

            for (int i = 0; i < ar.GetLength(0); i++)
            {
                if(i != k)
                {
                    long coef = ar[i, k];
                    Out.Ln("coef -> " + coef);
                    for (int j = 0; j < ar.GetLength(1); j++)
                    {
                        // [i,k]を0にしたい
                        ar[i, j] = (ar[i, j] - (ar[k, j] * coef) + (mod * 10)) % mod;
                    }
                }
            }

            // debug
            /*
            Out.Ln("------- debuging -------");
            for (int i = 0; i < ar.GetLength(0); i++)
            {
                for (int j = 0; j < ar.GetLength(1); j++)
                {
                    Out.Str(ar[i, j] + " ");
                }
                Out.Ln("");
            }
            */
        }

        // Out.Ln("--Answer--");
        for (int i = 0; i < ar.GetLength(0); i++)
        {
            for (int j = 0; j < ar.GetLength(1); j++)
            {
                Out.Str(ar[i, j]+" ");
            }
            Out.Ln("");
        }
    }

    public static int[,] CombModMake()
    {
        int[,] res = new int[2005, 2005];
        for (int i = 0; i < 2005; i++)
        {
            for (int j = 0; j < 2005; j++)
            {
                if (i == 0 || i < j)
                {
                    res[i, j] = 0;
                }
                else if (j == 0 || i == j)
                {
                    res[i, j] = 1;
                }
                else
                {
                    res[i, j] = (res[i - 1, j] + res[i - 1, j - 1]) % (int)MOD;
                }
            }
        }
        return res;
    }

    public static bool IsPrime(int a) //O(sqrt N)
    {
        int max = (int)Math.Sqrt(a);
        if (a <= 1) return false;
        for (int i = 2; i <= max; i++)
        {
            if (a % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static T GCD<T>(T a, T b)
    {
        if ((dynamic)b == 0)
        {
            return a;
        }
        else
        {
            return Algo.GCD((dynamic)b, (dynamic)a % (dynamic)b);
        }
    }
    static int Nibutan(long[] array, long k)
    {
        int low = 0;
        int high = array.Length - 1;
        int mid = high;

        while (low < high)
        {
            mid = (low + high) / 2;
            if (array[mid] >= k) // k以上の最小index.ココを変えるだけ
            {
                high = mid;
            }
            else
            {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return mid;
    }

}


public class Scan
{
    public static string Strln()
    {
        return Console.ReadLine();
    }
    public static int Int()
    {
        return int.Parse(Console.ReadLine());
    }

    public static long Long()
    {
        return long.Parse(Console.ReadLine());
    }

    public static string[] StringArray(int lines)
    {
        string[] str = new string[lines];
        for (int i = 0; i < lines; i++)
        {
            str[i] = Console.ReadLine();
        }
        return str;
    }

    public static int[] IntArray(int t)
    {
        string[] str = Console.ReadLine().Split(' ');
        int[] ar = new int[t];
        for (int i = 0; i < t; i++)
        {
            ar[i] = int.Parse(str[i]);
        }
        return ar;
    }

    public static string[] StringArrayInLine(int t)
    {
        string[] str = Console.ReadLine().Split(' ');
        return str;
    }

    public static Tuple<int, int> Tuple()
    {
        int[] tmp = Scan.IntArray(2);
        return new Tuple<int, int>(tmp[0], tmp[1]);
    }

    public static long[] LongArray(int t)
    {
        string[] str = Console.ReadLine().Split(' ');
        long[] ar = new long[t];
        for (int i = 0; i < t; i++)
        {
            ar[i] = long.Parse(str[i]);
        }
        return ar;
    }

    public static double[] DoubleArray(int t)
    {
        string[] str = Console.ReadLine().Split(' ');
        double[] ar = new double[t];
        for (int i = 0; i < t; i++)
        {
            ar[i] = double.Parse(str[i]);
        }
        return ar;
    }

    public static int[,] IntSquareArray(int h, int w)
    {
        int[,] resAr = new int[h, w];
        for (int i = 0; i < h; i++)
        {
            int[] ar = Scan.IntArray(w);
            for (int j = 0; j < w; j++)
            {
                resAr[i, j] = ar[j];
            }
        }
        return resAr;
    }

    public static long[,] LongSquareArray(int h, int w)
    {
        long[,] resAr = new long[h, w];
        for (int i = 0; i < h; i++)
        {
            long[] ar = Scan.LongArray(w);
            for (int j = 0; j < w; j++)
            {
                resAr[i, j] = ar[j];
            }
        }
        return resAr;
    }

}

public class Out
{
    public static void Str(string s)
    {
        Console.Write(s);
    }
    public static void Ln<T>(T s)
    {
        Console.WriteLine(s);
    }

    public static void YESNO(bool f)
    {
        Console.WriteLine(f ? "YES" : "NO");
    }
    public static void YesNo(bool f)
    {
        Console.WriteLine(f ? "Yes" : "No");
    }
    public static void Array<T>(T[] a)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.Length; i++)
        {
            sb.Append(a[i]);
            if (i != a.Length - 1)
            {
                sb.Append(" ");
            }
        }
        string s = sb.ToString();
        Console.WriteLine(s);
    }

    public static void List<T>(List<T> a)
    {
        for (int i = 0; i < a.Count; i++)
        {
            Console.Write(a[i]);
            if (i != a.Count - 1)
            {
                Console.Write(" ");
            }
        }
        Console.WriteLine("");
    }

}

public class Str
{
    public static string Connect(string a, string b)
    {
        StringBuilder sb = new StringBuilder(a);
        sb.Append(b);
        return sb.ToString();
    }
}


public class UnionFind
{
    public int[] parent;
    public int[] rank;
    public long[] weightDiff;

    public void Init(int size)
    {
        parent = new int[size + 5];
        rank = new int[size + 5];
        weightDiff = new long[size + 5];
        for (int i = 0; i < size; i++)
        {
            parent[i] = i;
            rank[i] = 0;
            weightDiff[i] = 0;
        }
    }

    public int Root(int x)
    {
        if (parent[x] == x)
        {
            return x;
        }
        else
        {
            int r = Root(parent[x]);
            weightDiff[x] += weightDiff[parent[x]];
            return parent[x] = r;
        }
    }

    public bool Unite(int x, int y, long w) // Add edge x <- y (weight: w)
    {
        w = w + GetWeight(x) - GetWeight(y);
        x = Root(x);
        y = Root(y);
        if (x == y) return false;
        if (rank[x] < rank[y])
        {
            int tmp = x; x = y; y = tmp;
            w *= -1;
        }
        if (rank[x] == rank[y])
        {
            ++rank[x];
        }
        parent[y] = x;
        weightDiff[y] = w;
        return true;
    }

    public bool Same(int x, int y)
    {
        return Root(x) == Root(y);
    }

    public long GetWeight(int x)
    {
        Root(x);
        return weightDiff[x];
    }

    public long Diff(int x, int y) // x -> y
    {
        return GetWeight(y) - GetWeight(x);
    }



}

public class SegmentTree<Monoid>
{
    private bool debug = false;
    // 0-indexed SegmentTree
    public int size;
    Monoid[] segTree;
    Monoid unit;
    public SegmentTree(int inSize, Monoid unit)
    {
        this.unit = unit;
        size = 2;
        while (size < inSize) size *= 2;
        segTree = new Monoid[2 * size];
        for (int i = 0; i < segTree.Length; i++)
        {
            segTree[i] = unit;
            // 単位元なので全部に代入しておけばよい
        }
    }

    public int BinarySearch(int x)
    {
        int high = size;
        int low = 0;
        int mid = (high + low) / 2;
        while (low < high)
        {
            // Console.WriteLine(low + " " + high);
            Monoid cmp = NonRecursiveQuery(0, mid);
            // Console.WriteLine("[ 0, " + mid + " ] -> " + cmp);
            if ((dynamic)cmp >= x)
            {
                high = mid;
            }
            else if ((dynamic)cmp < x)
            {
                low = mid + 1;
            }
            mid = (high + low) / 2;
        }
        return mid;
    }

    public void set(int iter, Monoid val)
    {
        segTree[iter + size - 1] = val;
    }

    public Monoid GetMonoid(int index)
    {
        return segTree[index + size - 1];
    }

    public void add(int iter, Monoid val)
    {
        update(iter, (dynamic)segTree[iter + size - 1] + (dynamic)val);
    }

    public void build()
    {
        // 2段目より上の構築
        for (int k = size - 2; k >= 0; k--)
        {
            segTree[k] = F(segTree[2 * k + 1], segTree[2 * k + 2]);
        }
    }

    public Monoid F(Monoid m1, Monoid m2)
    {
        Monoid res = Algo.GCD(m1, m2);
        return res;
    }

    public Monoid Query(int ql, int qr, int index, int nl, int nr)
    {
        // Recursive
        // [ql, qr)について考える
        // index に対応する範囲 nl <= x <= nr
        if (nr <= ql || qr <= nl)
        {
            if (debug) Console.WriteLine("Out: [l , r), [" + nl + " ," + nr + "), " + "index: " + index + " ,unit:" + unit);
            return unit;
        }
        if (ql <= nl && nr <= qr)
        {
            if (debug) Console.WriteLine("All in [l , r): [" + nl + " ," + nr + "), " + "index: " + index + ",rangeAns:" + segTree[index]);
            return segTree[index];
        }
        else
        {
            Monoid vl = Query(ql, qr, index * 2 + 1, nl, (nl + nr) / 2);
            Monoid vr = Query(ql, qr, index * 2 + 2, (nl + nr) / 2, nr);
            if (debug) Console.WriteLine("Recursive: [l , r),+: [" + nl + ", " + nr + "), index->" + index);
            if (debug) Console.WriteLine("(vl, vr): (" + vl + ", " + vr + ")");
            return F(vl, vr);
        }
    }

    public Monoid NonRecursiveQuery(int l, int r)
    {
        // 区間　-> [ l , r ]
        // 非再帰
        int L = l + size - 1;
        int R = r + size - 1;
        Monoid s = unit;
        while (L <= R)
        {
            if (L % 2 == 0)
            {
                s = F(s, segTree[L]);
                L++;
            }
            if (R % 2 == 1)
            {
                s = F(s, segTree[R]);
            }
            L /= 2;
            R /= 2;
            R--;
        }
        return s;
    }

    public void update(int k, Monoid x)
    {
        k += size - 1;
        segTree[k] = x;
        while (true)
        {
            k = (k - 1) / 2;
            segTree[k] = F(segTree[k * 2 + 1], segTree[k * 2 + 2]);
            if (k == 0)
            {
                break;
            }
        }
    }

    public void print()
    {
        Console.Write("Print:");
        for (int i = 0; i < segTree.Length; i++)
        {
            Console.Write(segTree[i] + " ");
        }
        Console.WriteLine("");
    }

}


// 計算量: Push -> O(logN), Peek -> O(1)。Clear() -> O(logN)
// ToArray()で配列化
public class PriorityQueue<T> where T : IComparable
{
    private IComparer<T> _comparer = null;
    private int _type = 0;
    private T[] _heap;
    private int _sz = 0;
    private int _count = 0;

    /// <summary>
    /// Priority Queue with custom comparer
    /// </summary>
    public PriorityQueue(int maxSize, IComparer<T> comparer)
    {
        _heap = new T[maxSize];
        _comparer = comparer;
    }

    /*
     -> Item: _heap(ヒープを持つ.sizeはmaxSize)
     -> Item: _type -> 0:asc(昇順), 1:desc(降順)
     */
    public PriorityQueue(int maxSize, int type = 0)
    {
        _heap = new T[maxSize];
        _type = type;
    }

    private int Compare(T x, T y)
    {
        if (_comparer != null) return _comparer.Compare(x, y);
        return _type == 0 ? x.CompareTo(y) : y.CompareTo(x);
        // typeが0なら昇順, 1なら降順にソートするCompare
    }

    public void Push(T x)
    {
        _count++;

        //node number
        var i = _sz++;

        while (i > 0)
        {
            //parent node number
            var p = (i - 1) / 2;
            if (Compare(_heap[p], x) <= 0) break;
            _heap[i] = _heap[p];
            i = p;
        }

        _heap[i] = x;
    }

    public T Pop()
    {
        _count--;

        T ret = _heap[0];
        T x = _heap[--_sz];

        int i = 0;
        while (i * 2 + 1 < _sz)
        {
            //children
            int a = i * 2 + 1;
            int b = i * 2 + 2;

            if (b < _sz && Compare(_heap[b], _heap[a]) < 0) a = b;

            if (Compare(_heap[a], x) >= 0) break;

            _heap[i] = _heap[a];
            i = a;
        }

        _heap[i] = x;

        return ret;
    }

    public int Count()  // O(1)
    {
        return _count;
    }

    public T Peek() // O(1)
    {
        return _heap[0];
    }

    public bool Contains(T x)   // O(N)なので注意
    {
        for (int i = 0; i < _sz; i++) if (x.Equals(_heap[i])) return true;
        return false;
    }

    public void Clear()
    {
        while (Count() > 0) Pop();
    }

    public IEnumerator<T> GetEnumerator() // なにこれ
    {
        var ret = new List<T>();

        while (Count() > 0)
        {
            ret.Add(Pop());
        }

        foreach (var r in ret)
        {
            Push(r);
            yield return r;
        }
    }

    public T[] ToArray()
    {
        T[] array = new T[_sz];
        int i = 0;

        foreach (var r in this)
        {
            array[i++] = r;
        }

        return array;
    }
}


