import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 100;
        for (int i = 0; i < 26; i++) {
            char alp  = (char)('a' + i);
            if(s.indexOf(alp) < 0) continue;
            int len = s.length() -1;
            boolean changed = true;
            char[] pre = s.toCharArray();
            int cnt = 0;
            while(changed){
                char[] cur = new char[len];
                changed = false;
                for (int j = 0; j < len; j++) {
                    if(pre[j] == alp || pre[j+1] == alp){
                        cur[j] = alp;
                    }else{
                        cur[j] = pre[j];
                    }
                    if(pre[j] != alp) changed = true;
                }
                if(pre[len] != alp) changed = true;
                if(changed)cnt++;
                pre = cur;
                len--;
            }
            ans = Math.min(ans, cnt);
        }
        System.out.println(ans);
        sc.close();
    }

}
