import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        // スペース区切りの整数の入力
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // 文字列の入力
        // String s = sc.next();
        // 出力

        if( N <600){
            System.out.println(8);
        }else if (N<800){
            System.out.println(7);
        }else if (N<1000){
            System.out.println(6);
        }else if (N<1200){
            System.out.println(5);
        }else if (N<1400){
            System.out.println(4);
        }else if (N<1600){
            System.out.println(3);
        }else if (N<1800){
            System.out.println(2);
        }else if (N<2000){
            System.out.println(1);
        }
    }
}