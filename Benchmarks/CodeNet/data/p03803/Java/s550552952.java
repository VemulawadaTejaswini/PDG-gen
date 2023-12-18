import java.util.Scanner;

/**
 * Created by liguoxiang on 2017/02/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        if(a==1){
            a=99;
        }
        if(b==1){
            b=99;
        }

        if( a>b){
            System.out.println("Alice");
        }else if(a<b){
            System.out.println("Bob");
        }else{
            System.out.println("Draw");
        }


    }
}