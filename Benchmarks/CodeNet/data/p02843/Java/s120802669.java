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
        //input
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        long x = sc.nextLong();

        long n = x/100;
        long n2 = x-(n*100);

//        System.out.println(n);
//        System.out.println(n2);

        if (5*n < n2) System.out.println(0);
        else System.out.println(1);

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