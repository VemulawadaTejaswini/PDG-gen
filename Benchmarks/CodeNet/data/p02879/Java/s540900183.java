import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 宣言
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = -1;
        
        // 処理
        if(a >= 10 || b >= 10){
            System.out.println(ans);            
        }else{
            ans = a * b;
            System.out.println(ans);            
        }
    }
}
