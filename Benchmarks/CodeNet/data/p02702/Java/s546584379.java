import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] charS = S.toCharArray();
        Long ans = 0l;

        for(int i=0;i<charS.length-3;i++){
            int x = Integer.parseInt(S.substring(i,i+4));
            int modx = x % 2019;
            if(modx == 0){
                ans++;
            }
            int mody = modx;
            for(int j=i+4;j<charS.length;j++){
                int y = Integer.parseInt(String.valueOf(charS[j]));
                mody = ((mody*10) +y ) % 2019;
                if(mody == 0){
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }

}







