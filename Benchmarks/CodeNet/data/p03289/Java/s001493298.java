import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String ans = "AC";
        if(S.charAt(0)!='A') ans = "WA";
        int cntC = 0;
        for(int i=2;i<S.length()-1;i++){
            if(S.charAt(i)=='C') cntC ++;
        }
        if(cntC!=1) ans = "WA";
        int cnt = 0;
        for(int i=1;i<S.length();i++){
            char cur = S.charAt(i);
            if(cur<'a'||cur>'z') cnt++;
        }
        if(cnt!=1) ans = "WA";
        System.out.println(ans);
    }
}
