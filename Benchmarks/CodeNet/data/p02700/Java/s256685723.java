import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int A = sc.nextInt();
        // スペース区切りの整数の入力
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        C = C - B;
        A = A - D;

        if (A <= 0){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}