import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int k = sc.nextInt();
        for(int i = 0; i < k; i++) {
            if(i % 2 == 0) {
                if(a % 2 == 1) a--;
                int tmp1 = a / 2;

                a -= tmp1;
                b += tmp1;

            } else {
                if(b % 2 == 1) b--;
                int tmp2 = b / 2;
                b -= tmp2;

            a += tmp2;

            }
            

        }
        System.out.println(a + " " + b);
    } 
}