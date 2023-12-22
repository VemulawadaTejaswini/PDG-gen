import java.util.*;

public class Main{
    /*標準入力
    n
    a_1 a_2 a_3 ... a_n
    */
    public static void main(String[] args){
        //入力部分
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //本体
        String ans = "";
        for (int i=0; i<N; i++){
            ans += "ACL";
        }
        //出力部分
        System.out.print(ans);
        sc.close();

    }
}
