import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        if(d==0){
            double ans = ((double)m-1)/((double)n);
            System.out.println(ans);
            System.exit(0);
        }
        if(n%2==1){
            double ans;
            if(d>(n-1)/2){
                ans = ((double)m-1.0)/((double)n);
                System.out.println(ans);
                System.exit(0);
            }
            else{
                ans = 2.0*((double)(n-d))*((double)m-1.0)/((double)(n*n));
                System.out.println(ans);

            }
            System.out.println(ans);
        }
        else{
            double ans;
            if(d>=(n-1)/2){
                ans = ((double)m-1.0)/((double)n);
                System.out.println(ans);
                System.exit(0);
            }
            else{
                ans = 2.0*((double)(n-d))*((double)m-1.0)/((double)(n*n));
                System.out.println(ans);

            }
            System.out.println(ans);
        }

    }
}