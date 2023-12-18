    import javax.swing.*;
    import java.util.*;
    import java.io.*;


    public class Main {
        public static class FastReader {
            BufferedReader br;
            StringTokenizer st;

            public FastReader() {
                br = new BufferedReader(new InputStreamReader(System.in));
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

            int nextInt() {
                return Integer.parseInt(next());
            }

            long nextLong() {
                return Long.parseLong(next());
            }

            double nextDouble() {
                return Double.parseDouble(next());
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


        }
        public class pair {
            int a;
            int b;

            pair(int p, int q) {
                a = p;
                b = q;
            }
            public int hashCode() {
                return new Integer(a).hashCode() * 31 + new Integer(b).hashCode();
            }
        }

        public static int gcd(int a, int b) {
            if (a == 1 || b == 1)
                return 1;
            if (a == 0)
                return b;
            if (b == 0)
                return a;
            return gcd(b % a, a);
        }






        public static void main(String[] args) {
            FastReader s=new FastReader();
            int a=s.nextInt();
           int[] arr=new int[a];
           for(int i=0;i<a;i++)
           {
               arr[i]=s.nextInt();
           }
           int flag=0;
           for(int i=0;i<a;i++)
           {
               if(arr[i]%2==0)
               {
                   if(arr[i]%3!=0 && arr[i]%5!=0)
                   {
                       flag=1;
                       break;
                   }
               }
           }
           if(flag==0)
               System.out.println("APPROVED");
           else
               System.out.println("DENIED");
        }
        




    }







