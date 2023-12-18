

import java.util.*;
import java.io.*;


public class Main {
        public static void main(String[] args) {
            MyScanner sc = new MyScanner();
            //out = new PrintWriter(new java.io.BufferedOutputStream(System.out));
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            if (a >= k) {
                System.out.println(k);
            } else {
                count += a;
                k -= a;
                if (b >= k) {
                    System.out.println(count);
                } else {
                    System.out.println(count - (k - b));
                }
            }



        }


       // public static PrintWriter out;

        public static class MyScanner {
            BufferedReader br;
            StringTokenizer st;

            public MyScanner() {
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

            double nextDouble() {
                return Double.parseDouble(next());
            }

            String nextLine(){
                String str = "";
                try {
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }

        }
    }