import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char[] s = sc.next().toCharArray();
        int n = s.length;
        
        int[] a = new int[n+1];
        for(int i=0; i<n; i++){
            if(s[i]=='<'){
                a[i+1] = a[i]+1;
            }
        }
        for(int i=n; i>=1; i--){
            if(s[i-1]=='>' && a[i-1]<a[i]+1){
                a[i-1] = a[i]+1;
            }
        }
        
        long ans = 0;
        for(int i=0; i<n+1; i++){
            ans += a[i];
        }
        System.out.println(ans);
    }
}
