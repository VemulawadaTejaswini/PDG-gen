import java.util.*;
 
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        //入力1行目の指定回数を取得
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int total = N - A;
        if(total == 0){
            System.out.println(0);
        }else{
            int kosuu = total / B;
            int kai = total - kosuu * B;
            System.out.println(kai);
        }
         
        
    }
}