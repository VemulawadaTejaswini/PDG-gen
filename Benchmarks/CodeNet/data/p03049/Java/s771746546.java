import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int a = 0;
        int b = 0;
        int ab = 0;
        for (int i=0;i<n;i++){
            String s = sc.next();
            if (s.charAt(0)=='B'){
                if (s.charAt(s.length()-1)=='A')ab++;
                else b++;
            }else {
                if (s.charAt(s.length()-1)=='A')a++;
            }
            for (int j=0;j<s.length()-1;j++){
                if (s.charAt(j)=='A'&&s.charAt(j+1)=='B')ans++;
            }
        }
        ans+=ab-1;
        if (a!=0){
            ans++;
            a--;
        }
        if (b!=0){
            ans++;
            b--;
        }
        ans+=Math.min(a,b);
        System.out.println(ans);
    }
}
