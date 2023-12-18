import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int K = sc.nextInt();
        int n = s.length();
        int[] dist = new int[n];
        char[] ans = s.toCharArray();
        for(int i=0;i<n;i++) dist[i]='z'-ans[i]+1;
        for(int i=0;i<n;i++){
            if(K<dist[i]) continue;
            K -= dist[i];
            ans[i]='a';
        }
        K = K%26;
        int cur = ans[n-1]-'a';
        cur = (cur+K)%26;
        ans[n-1]=(char)(cur+'a');
        String res = new String(ans);
        System.out.println(res);
    }
}
