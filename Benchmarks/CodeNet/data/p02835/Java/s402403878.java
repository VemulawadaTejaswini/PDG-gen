import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        if (a1+a2+a3 <= 21)
        {
            System.out.println("win");
        }else
        {
            System.out.println("bust");
        }

        sc.close();
    }

    public class Pair<F,S>
    {
        private final F first;
        private final S second;

        Pair(F first,S second)
        {
            this.first = first;
            this.second = second;
        }

        public void print() { System.out.println("("+this.first+","+this.second+")"); }

        //get
        public F first() {return this.first;}
        public S second() {return this.second;}

        @Override
        public boolean equals(Object object)
        {
            if (object instanceof Pair)
            {
                Pair pair = (Pair)object;
                return this.first==pair.first && this.second==pair.second;
            }else
            {
                return false;
            }
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(first,second);
        }
    }
}