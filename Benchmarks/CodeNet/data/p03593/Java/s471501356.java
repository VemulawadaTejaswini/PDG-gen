import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] c = new int[26];
        for (int i = 0; i < h; i++) {
            char[] a = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                c[a[j] - 'a']++;
            }
        }
        int f = (h/2)*(w/2)*4;
        int t = 0;
        int o = 0;
        if(h%2==1)t+=w;
        if(w%2==1)t+=h;
        if(h%2==1 && w%2==1){
            o++;
            t -= 2;
        }
        for (int i = 0; i < 26; i++) {
            int ff = Math.min(f, c[i]) /4 *4;
            f -= ff; c[i] -= ff;
            int tt = Math.min(t, c[i]) /2 *2;
            t -= tt; c[i] -= tt;
            int oo = Math.min(o, c[i]);
            o -= oo; c[i] -= oo;
        }
        System.out.println(f==0 && t==0 && o==0 ? "Yes" : "No");
        sc.close();

    }

}
