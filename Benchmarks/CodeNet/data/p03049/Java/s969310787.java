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
        int e = 0;
        //for文
        for(int i = 0; i < n; i++){
            str = sc.next();
            if(str.charAt(str.length()-1) == 'A') a++;
            if(str.charAt(0) == 'B') b++;
            if(str.charAt(str.length()-1) == 'A' && str.charAt(0) == 'B') e++;
            while(str.contains("AB")){
                ans++;
                str = str.substring(str.indexOf("AB") + 2, str.length());
            }
        }
        if(a > e && b > e) e = 0;
        else if(e > 0) e = 1;
        // 出力
        System.out.println(ans + Math.min(a, b) - e);

    }

}