import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int acnt = 0;
        int bcnt = 0;
        boolean flag = false;
        int m = 0;
        for(int i = 0; i<n; i++){
            String s = sc.next();
            for(int j = 0; j<s.length()-1; j++){
                if(s.charAt(j) == 'A'){
                    if(s.charAt(j+1)=='B') cnt++;
                }
            }
            if(s.charAt(0)=='B') bcnt++;
            if(s.charAt(s.length()-1)=='A') acnt++;
            }
        }
        int add = Math.min(acnt , bcnt);
        if(add==n) add--;
        System.out.println(cnt + add);
    }
}
