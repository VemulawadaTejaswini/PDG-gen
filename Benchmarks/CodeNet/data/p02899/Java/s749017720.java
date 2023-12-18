import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
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
        int n = sc.nextInt();
        Map<Integer,Integer> map =new HashMap<>();
        for (int i=0;i<n;++i)
        {
            int a=sc.nextInt();
            map.put(a,i+1);
        }

        for (int i=1;i<n+1;++i) System.out.println(map.get(i));
        sc.close();
    }
}