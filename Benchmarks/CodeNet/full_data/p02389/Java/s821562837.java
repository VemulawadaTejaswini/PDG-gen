import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // スペース区切りの整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int menseki = a * b;
        int syu = 2 * (a + b);

        // 出力
        System.out.print(menseki + " ");
        System.out.println(syu);
    }
}
