
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long res = 1;
        boolean flag = false;
        int N = sc.nextInt();
        long max = 1000000000000000000L;
        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();
            if(num == 0){
                System.out.println("0");
                return;
            }
            if(res* num > max){
                flag = true;
                res = 1;
            }
            res *= num;
        }
        if(flag){
            System.out.println("-1");
        } else {
            System.out.println(res);
        }
    }
}