import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        
        double ans = Math.round(N/1.08);
        System.out.println(ans);
        
        if(Math.floor(ans*1.08)==N){
            System.out.println((int)ans);
        }else{
            System.out.println(":(");
        }
        
    }
}
