import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        double ans = 0;
        for(int i = 0;i<n;i++){
            double x = sc.nextDouble();
            String s = sc.nextLine();
            if(s.equals(" JPY")){
                ans += x;
            }else{
                ans += (x*380000);
            }
        }

        System.out.format("%.4f",ans);
    }
}