import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Compute c1 = new Compute();//calc

        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();

        //input
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int x=sc.nextInt();

        int start = x-k;

        int last = x+k;

        for (int i=x-k+1;i<x+k;++i)
        {
            System.out.println(i);
        }

        //output
        //System.out.println(String.format("%.0f",answer));
    }
}