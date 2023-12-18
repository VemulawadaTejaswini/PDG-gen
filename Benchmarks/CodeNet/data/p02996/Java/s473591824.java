import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

    static long findGCD(long number1, long number2) {
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);
    }
    static class node implements Comparator<node>{
        long first;
        long second;

        public node(long a, long b){
            this.first = a;
            this.second = b;
        }
        @Override
        public int compare(node o1, node o2) {
            return (int)(o1.second-o2.second);
        }
    }

        public static void main(String[] args) {
            FastReader sc = new FastReader();
            int n = sc.nextInt();
            PriorityQueue<node> pq = new PriorityQueue<>(new node(0,0));
            for(int i=0; i<n; i++){
                pq.add(new node(sc.nextLong(),sc.nextLong()));
            }
            boolean check = true;
            long time = 0;
            while (!pq.isEmpty()){
                node temp = pq.poll();
                time+=temp.first;
                if(time>temp.second){
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            }
        }







