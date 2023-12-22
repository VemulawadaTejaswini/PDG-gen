import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //入力準備
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        
        //配列にデータを入れる
        for(int i = a; i <= b; i++ ){
            if(c % i == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
