import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char m = 'o';
        char b = 'x';
        boolean[] ans = null;
        for (int i = 0; i < 4; i++) {
            boolean[] a = new boolean[n];
            if((i&1) == 1) a[0] = true;
            else a[0] = false;
            if((i>>1 & 1) == 1) a[n-1] = true;
            else a[n-1] = false;
            if(a[0] && s[0] == m) a[1] = a[n-1];
            else if(a[0] && s[0] == b) a[1] = !a[n-1];
            else if(!a[0] && s[0] == m) a[1] = !a[n-1];
            else if(!a[0] && s[0] == b) a[1] = a[n-1];
            for (int j = 1; j < n-2; j++) {
                if(a[j] && s[j] == m) a[j+1] = a[j-1];
                else if(a[j] && s[j] == b) a[j+1] = !a[j-1];
                else if(!a[j] && s[j] == m) a[j+1] = !a[j-1];
                else if(!a[j] && s[j] == b) a[j+1] = a[j-1];
            }
            if(((a[n-2] && s[n-2] == m) || (!a[n-2] && s[n-2] == b)) && a[n-3] != a[n-1]) continue;
            if(((a[n-2] && s[n-2] == b) || (!a[n-2] && s[n-2] == m)) && a[n-3] == a[n-1]) continue;
            if(((a[n-1] && s[n-1] == m) || (!a[n-1] && s[n-1] == b)) && a[n-2] != a[0]) continue;
            if(((a[n-1] && s[n-1] == b) || (!a[n-1] && s[n-1] == m)) && a[n-2] == a[0]) continue;
            ans = a;
            break;
        }
        if(ans == null) System.out.println(-1);
        else{
            StringBuilder sb = new StringBuilder();
            for(boolean c : ans){
                if(c) sb.append("S");
                else sb.append("W");
            }
            System.out.println(sb.toString());
        }
        sc.close();

    }

}
