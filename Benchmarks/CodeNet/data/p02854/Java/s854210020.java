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
        //StringBuilder answer=new StringBuilder();
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int aSum = 0;
        for (int i=0;i<n;++i)
        {
            a[i]=sc.nextInt();
            aSum+=a[i];
        }

        int half = aSum/2;

        int halfSum = 0;
        int ind = 0;
        for (int i=0;i<n;++i)
        {
            halfSum+=a[i];

            if (halfSum == half)
            {
                System.out.println(0);
                System.exit(0);
            }else if (halfSum > half)
            {
                ind = i;
                break;
            }
        }

        int halfSum2 = 0;
        for (int i=ind+1;i<n;++i)
        {
            halfSum2 += a[i];
        }

        int ans = Math.abs(half-halfSum);
        ans += Math.abs(half-halfSum2);

        System.out.println(ans);

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