    ////////////////////////////////////////////////////
    //                                                //
    //  For her who keeps the fire kindling in me...  //
    //                                                //
    ////////////////////////////////////////////////////

    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.OutputStream;
    import java.io.OutputStreamWriter;
    import java.io.PrintWriter;
    // import java.util.Scanner;
    // import java.util.Arrays;
    // import java.util.ArrayList;
    // import java.util.Collections; 
    // import java.util.StringTokenizer;
    import java.util.*;
    import java.lang.Math;
    import java.awt.Point;

    import java.awt.geom.*;

    class Main {

        public static void main(String args[]) {
            try {
                FastReader s = new FastReader();
                BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
                int i, j, k, v, t, key, n, size, poster, minglob, minloc, beg, end, begl, endr, ind, l, r;// doub, b;
                long ans, f, ansmin, count, maxcount, x, y, x1, y1, x2, y2, x3, y3, x4, y4, sum1x, sum2x, sum3x, sum4x, sum1y, sum2y, sum3y, sum4y, max;
                boolean flag;
                
                n = s.nextInt();

                n--;
                int arr[] = new int[n+2];

                arr[0] = Integer.MAX_VALUE;
                arr[n+1] = Integer.MAX_VALUE;

                for(i=1; i<=n; i++)
                    arr[i] = s.nextInt();

                ans = 0l;
                for(i=1; i<(n+2); i++)
                    ans+=(long)Math.min(arr[i], arr[i-1]);
                w.write(ans+ "\n");
                w.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // ========================================### FAST IO ###=========================================//
    class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        Double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    // ====================================================================================================//