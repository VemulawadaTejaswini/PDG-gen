import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = 0;
        if(a >= b && a >= c){
            ans = a * 10 + b + c;
        } else if (b >= c){
            ans = b * 10 + a + c;
        } else {
            ans = c * 10 + a + b;
        }
        System.out.println(ans);
    }
}
