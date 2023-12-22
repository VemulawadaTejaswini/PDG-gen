import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ret = 0, a = 0;
        for(int i=0;i<20;i++){
            if(ret + Math.pow(26, i) >= n){
                a = i;
                break;
            }
            ret += Math.pow(26, i);
        }
        n -= ret;
        String ans = "";
        for(int k=0;k<a;k++){
             ans += (char)(n % 26 + 97);
             n /= 26;
        }
        for(int j=ans.length()-1;j>=0;j--)System.out.print(ans.charAt(j));
    }
}
