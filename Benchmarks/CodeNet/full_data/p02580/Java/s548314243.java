import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] hs = new int[h];
        int[] ws = new int[w];
        int[] x = new int[m];
        int[] y = new int[m];
        for(int i=0; i<m; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            hs[x[i]-1]++;
            ws[y[i]-1]++;
        }
        
        int hmax = 0;
        int hmaxidx = 0;
        for(int i=0; i<h; i++) {
            if(hmax < hs[i]) {
                hmax = hs[i];
                hmaxidx = i;
            }
        }
        
        int[] mapw = new int[w];
        for(int i=0; i<m; i++) {
            if(x[i] == hmaxidx+1) {
                mapw[y[i]-1]++;
            }
        }
        
        int count = 0;
        int max = 0;
        int wmaxidx = 0;
        for(int i=0; i<w; i++) {
            if(mapw[i] > 0) {
                count = hmax + ws[i] - 1;
            }else {
                count = hmax + ws[i];
            }
            
            if(max < count) {
                max = count;
                wmaxidx = i;
            }
        }
        System.out.println(max);

    }
}
