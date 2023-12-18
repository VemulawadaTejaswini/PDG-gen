import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt() ;
        long ans = 0;

        for (int i = 0; i < A; i++) {
            if(i%3 ==0 || i%5 == 0);
            else ans += i ;
        }

        System.out.println(ans);

    }
}
