public class Main {
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var h = sc.nextInt();
        var w = sc.nextInt();
        var m = sc.nextInt();
        var hary = new short[m];
        var wary = new short[m];
        var sumH = new short[h];
        var sumW = new short[w];
        for (int i = 0; i < m; i++) {
            hary[i] = (short) (sc.nextShort() - 1);
            wary[i] = (short) (sc.nextShort() - 1);
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
        System.out.println(mxH + mxW - ((dualflg) ? 1 : 0));
    }
}