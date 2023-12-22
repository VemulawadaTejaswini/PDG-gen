import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
        int n = s.length();
        int m = t.length();
        int max = 0;
        for(int i=0; i<n-m+1; i++){
            int cnt = 0;
            for(int j=0; j<m; j++){
                if(s.charAt(i+j)==t.charAt(j)){
                    cnt++;
                }
            }
            max = Math.max(cnt, max);
        }
        
        System.out.println(m-max);
    }
}
