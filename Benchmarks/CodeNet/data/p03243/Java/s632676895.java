import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int t=0;
        while(n>0){
          t=n%10>t?n%10:t;
          n/=10;
        }
        // 出力
        System.out.println(t*111);
    }
}
