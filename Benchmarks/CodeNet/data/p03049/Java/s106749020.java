import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        //配列の宣言
        String str;
        int ans = 0;
        int a = 0;
        int b = 0;
        //for文
        for(int i = 0; i < n; i++){
            str = sc.next();
            if(str.charAt(str.length()-1) == 'A') a++;
            if(str.charAt(0) == 'B') b++;
            while(str.contains("AB")){
                ans++;
                if(str.indexOf("AB") + 1 < str.length())str = str.substring(str.indexOf("AB") + 1, str.length());
            }
        }
        // 出力
        System.out.println(ans + Math.min(a, b));

    }

}
