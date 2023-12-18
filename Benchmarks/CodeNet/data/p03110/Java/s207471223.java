import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        double ans = 0;
        for(int i = 0; i < N; i++){
            double x = sc.nextDouble();
            String u = sc.next();
            if( u.equals("BTC") ) x *= 380000;
            ans += x;
        }
        
        System.out.println(ans);
        
    }
}
