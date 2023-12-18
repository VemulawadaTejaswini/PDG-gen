
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static int b = sc.nextInt();
    static int n = sc.nextInt();
    static int result = 0;
//    static int dp[] = new int[]
    public static void main(String[] args) {
        for (int i = 1; i <= n; i++){
            if (a * i >= b){
                if (result <= (a * i / b - a * (i / b))){
                    result = (a * i / b - a * (i / b));
                }
            }
        }
        System.out.println(result);
    }
    static int floor(int a, int b, int x){
        if (x == 1){
            return a / b;
        } else {

            return floor(a, b, x - 1);
        }
    }
}
