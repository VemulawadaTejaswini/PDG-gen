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
        //int n = sc.nextInt();
        String s = sc.next();
        if (s.equals("a")) System.out.println("b");
        if (s.equals("b")) System.out.println("c");
        if (s.equals("c")) System.out.println("d");
        if (s.equals("d")) System.out.println("e");
        if (s.equals("e")) System.out.println("f");
        if (s.equals("f")) System.out.println("g");
        if (s.equals("b")) System.out.println("h");
        if (s.equals("h")) System.out.println("i");
        if (s.equals("i")) System.out.println("j");
        if (s.equals("j")) System.out.println("k");
        if (s.equals("k")) System.out.println("l");
        if (s.equals("l")) System.out.println("m");
        if (s.equals("m")) System.out.println("n");
        if (s.equals("n")) System.out.println("o");
        if (s.equals("o")) System.out.println("p");
        if (s.equals("p")) System.out.println("q");
        if (s.equals("q")) System.out.println("r");
        if (s.equals("r")) System.out.println("s");
        if (s.equals("s")) System.out.println("t");
        if (s.equals("t")) System.out.println("u");
        if (s.equals("u")) System.out.println("v");
        if (s.equals("v")) System.out.println("w");
        if (s.equals("w")) System.out.println("x");
        if (s.equals("x")) System.out.println("y");
        if (s.equals("y")) System.out.println("z");
        
        
        
        

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