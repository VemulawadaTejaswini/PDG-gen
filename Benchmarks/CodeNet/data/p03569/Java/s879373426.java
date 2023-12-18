import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        sc.close();

        String str = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != 'x')
                str += String.valueOf(s.charAt(i));
        }
        int n = str.length();

        if(n > 1){
            for(int i = 0; i < n/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-i-1)){
                    System.out.println(-1);
                    return;
                }
            }
        }

        int[] cntx = new int[n+1];
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'x'){
                cntx[idx]++;
            } else {
                idx++;
            }
        }

        int ans = 0;
        if(n == 0){
            System.out.println(0);
        } else {
            for(int i = 0; i < (n+1)/2; i++){
                ans += Math.abs(cntx[i]-cntx[n-i]);
            }
            System.out.println(ans);
        }
   }
}