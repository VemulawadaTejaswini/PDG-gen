import java.util.*;

public class Main {
        public static void main(String [] args){
            Scanner sc =new Scanner(System.in);
            double ans = 0;
            double n = sc.nextLong();
            double m = sc.nextLong();
            double d = sc.nextLong();

            if(d==0) {
                System.out.println((1.0/n)*(m-1));
            }else {
                ans =2.0*(n-d)/n/n;
                System.out.println(ans *(m-1.0));
            }

        }
}
