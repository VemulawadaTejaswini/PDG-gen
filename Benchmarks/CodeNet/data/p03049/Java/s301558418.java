import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static int n,a,b,k;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        n = sc.nextInt();
        long ans = 0,head =0, tail = 0;
        for(int i=0;i<n;i++){
            char[] s = sc.next().toCharArray();
            int len = s.length;
            if(s[0]=='B') head++;
            if(s[len-1]=='A') tail++;
            for(int j=0;j<len-1;j++){
                if(s[j]=='A'&&s[j+1]=='B') ans++;
            }
        }
        ans += help(head,tail);
        System.out.println(ans);
    }
    static long help(long head, long tail){
        if(head==n) head--;
        if(tail==n) tail--;
        return Math.min(head,tail);
    }
}

