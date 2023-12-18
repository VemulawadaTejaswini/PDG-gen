import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        //配列の宣言
        String[] str = new String[n];
        int ans = 0;
        int a = 0;
        int b = 0;
        //for文
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
            if(str[i].contains("AB")) ans++;;
            if(str[i].charAt(str[i].length()-1) == 'A') a++;
            if(str[i].charAt(0) == 'B') b++;
        }
        // 出力
        System.out.println(ans + Math.min(a, b));

    }

}
