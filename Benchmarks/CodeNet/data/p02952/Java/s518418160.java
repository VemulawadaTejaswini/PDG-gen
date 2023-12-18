import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Compute c1 = new Compute();//calc

        long count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();

        //input
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<n+1;++i)
        {
            String s = String.valueOf(i);
            if (s.length()%2==1)
            {
                ++count;
            }
        }
        System.out.println(count);
        //output
        //System.out.println(String.format("%.0f",answer));
    }
}