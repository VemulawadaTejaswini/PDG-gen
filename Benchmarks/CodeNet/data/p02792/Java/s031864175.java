

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        MyReader mr = new MyReader();

        int n = mr.nextInt();

        Map<String,Integer> map = new HashMap<>();

        for(int i = 1;i<=n;i++){
            if(i%10 == 0)continue;
            String s = ""+i;
            s = s.charAt(0)+""+s.charAt(s.length()-1);
            map.put(s,map.getOrDefault(s,0)+1);
        }

        long sum = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                String a = ""+i+j;
                String b = ""+j+i;

                if(map.containsKey(a) && map.containsKey(b)){
                    sum+=(map.get(a)*map.get(b));
                }
            }
        }

        System.out.println(sum);


    }

    static class MyReader {
        BufferedReader br;
        StringTokenizer st;

        MyReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
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

        String nextLine() {
            String res = "";
            try {
                res = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return res;
        }

        int[] nextIntArray(int n) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            return arr;
        }

        long[] nextLongArray(int n) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            return arr;
        }

        String[] nextStringArray(int n) {
            String res = "";
            try {
                res = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }

            String[] arr = res.split(" ");
            return arr;
        }
    }

    static class Pair{
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(new int[]{x,y});
        }

        @Override
        public boolean equals(Object obj) {
            Pair that = (Pair)obj;
            return this.x == that.x && this.y == that.y;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}


