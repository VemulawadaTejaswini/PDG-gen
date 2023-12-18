import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        double[] x = new double[n];
        String[] u = new String[n];
        for (int i = 0; i < n; i++)
        {
            x[i] = scan.nextDouble();
            u[i] = scan.next();
        }
        double ans = 0;
        for(int i = 0; i < n; i++)
        {
            if(u[i].equals("BTC"))
            {
                ans += x[i] * 380000;
            }
            else
            {
                ans += x[i];
            }
        }
        System.out.println(ans);
    }
}