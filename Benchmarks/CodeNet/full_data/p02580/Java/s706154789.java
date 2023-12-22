public class Main {
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var h = sc.nextInt();
        var w = sc.nextInt();
        var m = sc.nextInt();
        var hary = new int[m];
        var wary = new int[m];
        var sumH = new int[h];
        var sumW = new int[w];
        for (int i = 0; i < m; i++) {
            hary[i] =  (sc.nextInt() - 1);
            wary[i] =  (sc.nextInt() - 1);
        }
        for (int i = 0; i < m; i++) {
            sumH[hary[i]]++;
            sumW[wary[i]]++;
        }
        int mxH = 0;
        int mxW = 0;
        for (int i = 0; i < m; i++) {
            mxH = Math.max(mxH, sumH[hary[i]]);
            mxW = Math.max(mxW, sumW[wary[i]]);
        }
        var dualflg = false;
        for (int i = 0; i < m; i++) {
            if (mxH == sumH[hary[i]]&& mxW == sumW[wary[i]]) {
                dualflg = true;
            }
        }
        System.out.println(dualflg);
        System.out.println(mxH + mxW - ((dualflg) ? 1 : 0));
    }
}
