import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    final static int MAX = 10000+5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int n = in.nextInt();
        //void cp(int c,int w){for(int i=c; i<=v; i++)f[i]=max(f[i],f[i-c]+w);}
        int[] f = new int[MAX*2];
        int[] a = new int[MAX*2];
        int[] b = new int[MAX*2];
        int maa = 0;
        int mib = MAX;
        for (int k = 0; k < n; k++) {
            a[k] = in.nextInt();
            b[k] = in.nextInt();
            maa = min(a[k], maa);
            mib = min(b[k], mib);
        }
        int ans=100000000;
        for (int i = 1; i <= h + maa; i++) {
            f[i] = f[i - 1] + mib;
            for (int j = 0; j < n; j++) {
                if (i >= a[j])
                    f[i] = min(f[i], f[i - a[j]] + b[j]);
            }
            if (i == h) ans = f[h];
            else if (i >= h) ans = min(ans, f[h]);

        }
        System.out.println(ans);

    }
}
