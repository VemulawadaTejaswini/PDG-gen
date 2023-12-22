//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
public class Main {
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] Args)throws Exception{
        FastReader scan=new FastReader(System.in);
        int t=1;
//        t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            ArrayList<Trip> af=new ArrayList<>();
            ArrayList<Trip> bf=new ArrayList<>();
//            int[] a=new int[n];
            int prev=scan.nextInt();
            int c=1;
            int b=0;
            for(int i=1;i<n;i++){
                int num=scan.nextInt();
                if(num==prev){
                    c++;
                }else{
                    af.add(new Trip(prev,c,b));
                    prev=num;
                    b=i;
                    c=1;
                }
            }
            af.add(new Trip(prev,c,b));
//            int[] b=new int[n];
            prev=scan.nextInt();
            c=1;
            b=0;
            for(int i=1;i<n;i++){
                int num=scan.nextInt();
                if(num==prev){
                    c++;
                }else{
                    bf.add(new Trip(prev,c,b));
                    prev=num;
                    b=i;
                    c=1;
                }
            }
            bf.add(new Trip(prev,c,b));
            Collections.sort(af);
            PriorityQueue<Trip> pq=new PriorityQueue<>(new mc());
            for(Trip tp:bf){
                pq.add(tp);
            }
            boolean pos=true;
            int[] ans=new int[n];
            for(int i=0;i<af.size();i++){
                Trip cur=af.get(i);
                while(cur.y!=0){
                    Trip chk=pq.remove();
                    if(chk.x==cur.x) {
                        if (pq.isEmpty()) {
                            pos = false;
                            break;
                        } else {
                            Trip temp=pq.remove();
                            pq.add(chk);
                            chk=temp;
                        }
                    }
                    int sub=Math.min(cur.y,chk.y);
                    cur.y-=sub;
                    chk.y-=sub;
                    if(chk.y!=0){
                        pq.add(chk);
                    }
                    for(int j=0;j<sub;j++){
                        ans[cur.b+j]=chk.x;
                    }
                    cur.b+=sub;
                }
                if(!pos){
                    break;
                }
            }
            if(!pos){
                out.println("No");
            }else{
                out.println("Yes");
                for(int i=0;i<n;i++){
                    out.print(ans[i]+" ");
                }
                out.println();
            }
        }
        out.flush();
        out.close();
    }
    static class mc implements Comparator<Trip>{
        @Override
        public int compare(Trip o1, Trip o2) {
            return -o1.y+o2.y;
        }
    }
    static class Trip implements Comparable<Trip>{
        int x;
        int y;
        int b;
        Trip(int x,int y,int b) {
            this.x = x;
            this.y = y;
            this.b=b;
        }

        @Override
        public int compareTo(Trip o) {
            return -this.y+o.y;
        }
        //        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Pair)) return false;
//            Pair key = (Pair) o;
//            return x == key.x && y == key.y;
//        }
//
//        @Override
//        public int hashCode() {
//            int result = x;
//            result = 31 * result + y;
//            return result;
//        }
    }
    static class FastReader {

        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;

        FastReader(InputStream is) {
            in = is;
        }

        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }

        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan()) ;
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char) c);
            }
            return sb.toString();
        }

        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }
}
