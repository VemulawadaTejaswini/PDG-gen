import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        int x = sc.nextInt();
        int a1 = sc.nextInt();
        
        if((a+a1) == x && (x+a1) == b){
            System.out.println("yes");
        }else {
            System.out.println("NO");
        }
        
    }

}