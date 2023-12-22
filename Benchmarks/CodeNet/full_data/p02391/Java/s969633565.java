import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //入力準備
       Scanner sc = new Scanner(System.in);
       
       //入力値の受け取り
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       //計算して出力
        if (a < b){
            System.out.println("a < b");
        }else if (a > b){
            System.out.println("a > b");
        }else{
            System.out.println("a == b");
        }
    }
}
