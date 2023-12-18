import java.util.*;

class Pair<U, V>
{
    public final U first;   	// first field of a Pair
    public final V second;  	// second field of a Pair

    // Constructs a new Pair with specified values
    public Pair(U first, V second)
    {
        this.first = first;
        this.second = second;
    }

    @Override
    // Checks specified object is "equal to" current object or not
    public boolean equals(Object o)
    {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        lib.others.Pair<?, ?> pair = (lib.others.Pair<?, ?>) o;

        // call equals() method of the underlying objects
        if (!first.equals(pair.first))
            return false;
        return second.equals(pair.second);
    }

    @Override
    // Computes hash code for an object to support hash tables
    public int hashCode()
    {
        // use hash codes of the underlying objects
        return 31 * first.hashCode() + second.hashCode();
    }

    @Override
    public String toString()
    {
        return "(" + first + ", " + second + ")";
    }

    // Factory method for creating a Typed Pair immutable instance
    public static <U, V> lib.others.Pair<U, V> of(U a, V b)
    {
        // calls private constructor
        return new lib.others.Pair<>(a, b);
    }
}

public class Main {

    static int n;
    static List<List<Pair>> list;

    static boolean judge(int bit) {

        for (int i = 0; i < n; ++i) {

            if ((bit & (1 << i)) == 0) continue;

            for (Pair xy : list.get(i)) {
                Integer x = (Integer)xy.first;
                Integer y = (Integer)xy.second;

                if (y == 1 && (bit & (1 << x)) == 0) return false;
                if (y == 0 && (bit & (1 << x)) != 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i < n; ++i) list.add(new ArrayList<>());

        for (int i = 0; i < n; ++i) {
            int a = sc.nextInt();
            for (int j = 0; j < a; ++j) {
                list.get(i).add(new Pair(sc.nextInt() - 1, sc.nextInt()));
            }
        }

        int res = 0;
        for (int bit = 0; bit < (1 << n); ++bit) {

            if (judge(bit)) {

                int count = 0;
                for (int i = 0; i < n; ++i) {
                    if ((bit & (1 << i)) != 0) ++count;
                }
                res = Math.max(res, count);
            }
        }

        System.out.println(res);
    }
}