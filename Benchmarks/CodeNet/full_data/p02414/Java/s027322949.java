import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_7_D
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    private final static String SPACE = " ";
    
    public static void main(String[] args) {
        try {
            LineNumberReader stdReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            int n = 0;
            int m = 0;
            int l = 0;
            int[][] a = null;
            int[][]b = null;
            while ((sStr = stdReader.readLine()) != null) {
                
                // ????????????????????????
                if (stdReader.getLineNumber() == 1) {
                    String[] inputs = sStr.split(" ");
                    n = Integer.valueOf(inputs[0]);
                    m = Integer.valueOf(inputs[1]);
                    l = Integer.valueOf(inputs[2]);
                    // ??????????´???¨??????
                    a = new int[n][];
                    b = new int[m][];
                } else if (stdReader.getLineNumber() <= 1 + n) {
                    // 2????????\??????????????????
                    // ??????????????°(0,1,2,...)
                    int i = stdReader.getLineNumber() - 2;
                    String[] inputs = sStr.split(SPACE);
                    int j = 0;
                    a[i] = new int[m];
                    for (String input : inputs) {
                        a[i][j] = Integer.parseInt(input);
                        j++;
                    }
                } else if (stdReader.getLineNumber() <= 1 + n + m) {
                    String[] inputsVector = sStr.split(SPACE);
                    int k = stdReader.getLineNumber() - (2+n);
                    b[k] = new int[l];
                    int j = 0;
                    for (String input : inputsVector) {
                        b[k][j] = Integer.parseInt(input);
                        j++;
                    }
                    if (stdReader.getLineNumber() == 1+n+m) break;
                }
            }
            
            int c[][] = new int[n][l];

            // ?????? x ?????????????????????
            for (int k =0; k<l; k++) {
            for (int i =0; i<n; i++) {
                int temp = 0;
                for (int j = 0; j<m; j++){
                    temp += a[i][j] * b[j][k];
                }
                c[i][k] = temp;
            }
            }
            
            // ??¢???????????????

            for (int i=0; i<n; i++) {
                for (int k=0; k<l; k++) {
                    System.out.print(c[i][k]);
                    if (k<l-1) System.out.print(SPACE);
                }
                System.out.println();
            }
            
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
}