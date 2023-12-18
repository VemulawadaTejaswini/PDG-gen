import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        Vector<Integer> dp = new Vector<>();
      
      	for(Integer i=0; i<n+1; i++)
        {
          dp.add(1);
        }
        
        for(Integer i = 0; i < m; i++)
        {
            dp.set(sc.nextInt(), 0);
        }
        
        for(Integer i = 2; i < n+1; i++)
        {
            if( dp.get(i) != 0 )
            { 
            	dp.set(i, dp.get(i-1) + dp.get(i-2));
            }
        }
        
        System.out.println(dp.get(n)%1000000007);
    }
}