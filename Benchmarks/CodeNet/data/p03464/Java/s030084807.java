import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        FastReader s = new FastReader();
        int k = s.nextInt();
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = s.nextInt();
        }


        long l = 2, h = 2;
        for(int i=k-1;i>=0;i--){
            if(l%arr[i]!=0){
                l = (l/arr[i])*arr[i]+arr[i];
            }
//            System.out.println(l);
            h = (h/arr[i])*arr[i]+arr[i]-1;
//            System.out.println(i+" "+arr[i]+" "+l+" "+h);
        }
        if(l<=h){
            System.out.println(l+" "+h);
        }else{
            System.out.println("-1");
        }


//        LinkedList<Integer> o = new LinkedList<>();
//        LinkedList<Integer> e = new LinkedList<>();
//
//        int x = k;
//        if(x%2==0){
//            e.add(2);
//        }else{
//            o.add(2);
//        }
//        x--;
//        while(x>=0){
//            if(x%2==0){
//                while(!o.isEmpty()){
//                    int val = o.poll();
//                    if(val>=arr[x] && val%arr[x]==0){
//                        for(int i=val;i<val+arr[x];i++){
//                            e.add(i);
//                        }
//                    }
//                }
//                if(e.isEmpty()){
//                    System.out.println("-1");
//                    return;
//                }
//            }else{
//                while(!e.isEmpty()){
//                    int val = e.poll();
//                    if(val>=arr[x] && val%arr[x]==0){
//                        for(int i=val;i<val+arr[x];i++){
//                            o.add(i);
//                        }
//                    }
//                }
//                if(o.isEmpty()){
//                    System.out.println("-1");
//                    return;
//                }
//            }
//            x--;
//        }
//
//        int min = Integer.MAX_VALUE, max = -1;
//        ListIterator<Integer> i = e.listIterator();
//        while (i.hasNext()){
//            int val = i.next();
//            min = Math.min(min,val);
//            max = Math.max(max,val);
//        }
//
//        if(max == -1 && min == Integer.MAX_VALUE){
//            System.out.println(-1);
//        }else{
//            System.out.println(min+" "+max);
//        }

    }

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
}
