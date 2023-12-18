import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] f=new long[n+1];
        Point[] sushi = new Point[n];
        HashSet<Integer> all = new HashSet<>();
        for (int i = 0; i < n; i++) {
            sushi[i]=(new Point(sc.nextInt(), sc.nextInt()));
            all.add(sushi[i].x);
        }
        Arrays.sort(sushi,(p1, p2) -> p2.y - p1.y);
        HashSet<Integer> num = new HashSet<>();
        int[] s = new int[n + 1];
        long temp=0;
        for (int i = 0; i < k; i++) {
            temp += sushi[i].y;
            s[sushi[i].x]++;
            num.add(sushi[i].x);
        }
        f[num.size()]=temp;
        int l = k - 1, r = k;
        long ans = temp + num.size() * num.size();
        while (l > 0 && r < n) {
            int tl=l,tr=r;
            while (s[sushi[l].x] == 1 && l > 0) {
                l--;
            }
            if (l>0) {
                while (s[sushi[r].x] > 0 && r < n) {
                    r++;
                }
                if (r < n) {
                    s[sushi[r].x]++;
                    s[sushi[l].x]--;
                    num.add(sushi[r].x);
                    f[num.size()] = f[num.size() - 1] - sushi[l].y + sushi[r].y;
                }
            }
        }
        for (int i = 0; i <= all.size(); i++) {
            ans=max(ans,f[i]+i*i);
        }
        out.println(ans);
    }
}