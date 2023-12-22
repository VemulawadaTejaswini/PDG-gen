import java.util.Scanner;

public class Chebyshevs_Theorem {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if(n==0){
                break;
            }
            sosuu(n);
        }
    }
    public static void sosuu(int n){
        int a=0;
        int b=0;
        for (int i =n+1; i <=2*n ; i++) {
            for (int j = 2; j <=i ; j++) {
                if (i %j == 0) {
                    a++;
                }
            }
                if(a==1){
                    b++;
                }
          a=0;
        }
        System.out.println(b);
    }
}