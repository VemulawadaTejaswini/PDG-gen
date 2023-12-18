import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    final static int MAX = 10000 + 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int n = in.nextInt();
        //void cp(int c,int w){for(int i=c; i<=v; i++)f[i]=max(f[i],f[i-c]+w);}
        int[] f = new int[MAX * 2];
        int[] a = new int[MAX * 2];
        int[] b = new int[MAX * 2];
        int maa = 0;
        int mib = MAX;
        for (int k = 0; k < n; k++) {
            a[k] = in.nextInt();
            b[k] = in.nextInt();
            maa = max(a[k], maa);
            mib = min(b[k], mib);
        }
        int ans = 100000000;
        for (int i = 1; i <= h + maa; i++) {
            f[i] = ans;
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                f[i + a[j]] = min(f[i + a[j]], f[i] + b[j]);
            }
        }
        for (int i = h; i <= h + maa; i++) {
            ans = min(ans, f[i]);
        }
        System.out.println(ans);

    }
}
