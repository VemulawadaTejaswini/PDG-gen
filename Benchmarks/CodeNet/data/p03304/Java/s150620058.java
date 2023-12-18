import java.util.Scanner;

public class Main {
        public static void main(String [] args){
            Scanner sc =new Scanner(System.in);
            int sum = 0;
            long ans = 0;
            long n = sc.nextLong();
            long m = sc.nextLong();
            long d = sc.nextLong();

            if(d==0) {
                System.out.println(n);
            }else {
                ans =2*(n-d+1);
                System.out.println(ans/(n*n));
            }

        }
}