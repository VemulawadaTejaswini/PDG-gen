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
        String s = sc.next();
        if (s.equals("SUN"))
        {
            System.out.println(7);
        }else if (s.equals("MON"))
        {
            System.out.println(6);
        }else if (s.equals("TUE"))
        {
            System.out.println(5);
        }else if (s.equals("WED"))
        {
            System.out.println(4);
        }else if (s.equals("THU"))
        {
            System.out.println(3);
        }else if (s.equals("FRI"))
        {
            System.out.println(2);
        }else if (s.equals("SAT"))
        {
            System.out.println(1);
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