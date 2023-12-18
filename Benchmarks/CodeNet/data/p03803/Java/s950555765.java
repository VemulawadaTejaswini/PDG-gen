mport java.util.Scanner;

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

        if(((a!=b)&&(a==1))|| a>b){
            System.out.println("Alice");
        }else if(((a!=b) && (b==1)) ||a<b){
            System.out.println("Bob");
        }else{
            System.out.println("Draw");
        }


    }
}