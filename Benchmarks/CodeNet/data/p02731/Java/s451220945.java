import java.math.BigDecimal;
import java.util.Scanner;

public class Main{
    
 
    public static void main(String[] args)  {
        new Main().solve();
    }

    void solve(){
        Scanner sc = new Scanner(System.in);        
        double L = sc.nextDouble();
        sc.close();

        double n1,n2,n3;
        
        n1 = L/3;
        n2 = L/3;
        n3 = L - n1 -n2;

        System.out.println(BigDecimal.valueOf(n1 * n2 * n3).toPlainString());

    }
}