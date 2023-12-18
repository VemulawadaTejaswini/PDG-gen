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
        String s = sc.next();
        List<String> mae = new ArrayList<>();
        List<String> usiro = new ArrayList<>();

        for (int i=0;i<s.length();++i)
        {
            mae.add(s.substring(i,i+1));
        }

        for (int i=s.length()-1;i >= 0;--i)
        {
            usiro.add(s.substring(i,i+1));
        }

        for (int i=0;i<s.length();++i)
        {
            if (!mae.get(i).equals(usiro.get(i))) ++count;
        }

        System.out.println(count/2);

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