import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        int[][] a = new int[3][3];
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                a[i][j] = Integer.parseInt(sc.next());
//                pw.print(a[i][j] + " ");
            }
//            pw.println();
        }
        
        int n = Integer.parseInt(sc.next());
        int[] b = new int[n];
        for (int i=0; i<n; i++) {
            b[i] = Integer.parseInt(sc.next());
//            pw.println(b[i]);
        }
        
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<n; k++) {
                    if (a[i][j] == b[k]) a[i][j] = 0;
                }
//                pw.print(a[i][j] + " ");
            }
//            pw.println();
        }
        
        if ((a[0][0] == 0 && a[0][1] == 0 && a[0][2] == 0)
                || (a[1][0] == 0 && a[1][1] == 0 && a[1][2] == 0)
                || (a[2][0] == 0 && a[2][1] == 0 && a[2][2] == 0)
                || (a[0][0] == 0 && a[1][0] == 0 && a[1][0] == 0)
                || (a[0][1] == 0 && a[1][1] == 0 && a[2][1] == 0)
                || (a[0][2] == 0 && a[1][2] == 0 && a[2][2] == 0)
                || (a[0][0] == 0 && a[1][1] == 0 && a[2][2] == 0)
                || (a[0][2] == 0 && a[1][1] == 0 && a[3][0] == 0)) {
            pw.println("Yes");
        } else {
            pw.println("No");
        }
        
        pw.flush();
    }
}