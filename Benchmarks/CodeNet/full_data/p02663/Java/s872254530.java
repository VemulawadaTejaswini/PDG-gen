import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


// written by luchy0120

public class Main {
    public static void main(String[] args) throws Exception {

        new Main().run();
    }


    long sum(long r,long a,long b){

        long bb = r/b;
        // [ 0, bb]
        if(bb%a!=0){
            return r +1 - (bb/a+1)*(b);
        }else{
            return r - ((bb)/a)*b  - r%b;
        }

    }

    int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }



    public class Solution {
        /**
         * @param position: the position of circle A,B and point P.
         * @return: if two circle intersect return 1, otherwise -1.
         */


        double dis(double x1,double y1,double x2,double y2){
            if(Math.abs(x1-x2)>10000||Math.abs(y1-y2)>10000){
                return 50000;
            }
            return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        }



        public int IfIntersect(double[] p) {
            //

            double x = p[0];
            double y = p[1];
            double r1 = p[2];

            double x1 = p[3];
            double y1 = p[4];
            double r2 = p[5];


            double c1 = p[6];
            double c2 = p[7];





            double dis1 = dis(x1,y1,c1,c2);
            double dis2 = dis(x1,y1,x,y);



            if(dis1<=(r1+r2)*(r1+r2)){
                return 1;
            }
            if(dis2<=(r1+r2)*(r1+r2)){
                return 1;
            }

            double dx1 = x1-c1;
            double dy1 = y1-c2;
            double dx2 = x-c1;
            double dy2  =y-c2;

            double jj = dx1*dx2+dy2*dy1;


            dx1 = x1-x;
            dy1 = y1-y;
            dx2 = c1-x;
            dy2 = c2-y;

            double jj1 = dx1*dx2+dy2*dy1;

            if(jj>0&&jj1>0){





                double mj = s(x,y,c1,c2,x1,y1);

                double dis = (x-c1)*(x-c1)+(y-c2)*(y-c2);


                double ht = mj*mj/dis;

                if(ht>(r1+r2)*(r1+r2)){
                    return -1;
                }
                return 1;
            }else{

                return -1;
            }




        }


        //S=(1/2)* | (x1y2+x2y3+x3y1-x2y1-x3y2-x1y3) |

        public  double s(double x1,double y1,double x2,double y2,double x3,double y3){
            return Math.abs(x1*y2-x1*y3+x2*y3-x2*y1+x3*y1-x3*y2);
        }
    }











    public String kthString(int n, long k) {
        // write your code here.




        long two [ ] = new long[64];
        two[0] = 1;
        for(int i=1;i<=62;++i){
            two[i] =2*two[i-1];
        }

        if(n<=62&&3L*two[n-1]<k){
            return "";
        }


        char lst = ' ';
        StringBuilder sb = new StringBuilder();
        long nn = n-1;
        if(n>62){
            nn  = 62;
        }
        int sz = (int)nn+1;
        StringBuilder prev = new StringBuilder();
        for(int i=0;i<n-sz;++i){
            if(i%2==0) {
                prev.append('a');lst  ='a';
            }else{
                prev.append('b');lst = 'b';
            }
        }


        for(int i=(int)nn;i>=0;--i){
            if(k<=two[i]){
                int add =0;
                for(char c='a';c<='c';++c){
                    if(c==lst) continue;
                    add++;
                    if(add==1){
                        sb.append(c);lst =c;
                        break;
                    }
                }

            }else if(k<=2L*two[i]){
                int add =0;
                for(char c='a';c<='c';++c){
                    if(c==lst) continue;
                    add++;
                    if(add==2){
                        sb.append(c);lst =c;
                        break;
                    }
                }
                k -= two[i];
            }else{
                sb.append('c');lst = 'c';
                k -= 2*two[i];
            }

        }


        return prev.toString()+sb.toString();






    }




    void solve() {

        long h  = ni();
        long m  = ni();
        long h1  = ni();
        long m1  = ni();


        long t = h*60+m;
        long t1 = h1*60+m1;

        long k = nl();

        println(t1-t-k);




    }

    double dis(long x,long y,long a,long b){
        long v = (x-a)*(x-a)+(y-b)*(y-b);
        return Math.sqrt(v);
    }







    InputStream is;
    PrintWriter out;

    void run() throws Exception {
        //is = new FileInputStream(new File("C:\\Users\\Luqi\\Downloads\\P3387_9.in"));
        is = System.in;
        out = new PrintWriter(System.out);

        solve();
        out.flush();
    }

    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;

    private int readByte() {
        if (lenbuf == -1) throw new InputMismatchException();
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (lenbuf <= 0) return -1;
        }
        return inbuf[ptrbuf++];
    }

    private boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    private int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b)) ;
        return b;
    }

    private double nd() {
        return Double.parseDouble(ns());
    }

    private char nc() {
        return (char) skip();
    }

    private char ncc() {
        int b = readByte();
        return (char) b;
    }

    private String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while (p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private String nline() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!isSpaceChar(b) || b == ' ') {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[][] nm(int n, int m) {
        char[][] a = new char[n][];
        for (int i = 0; i < n; i++) a[i] = ns(m);
        return a;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = ni();
        return a;
    }

    private long[] nal(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nl();
        return a;
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) {
        }
        ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') num = (num << 3) + (num << 1) + (b - '0');
            else return minus ? -num : num;
            b = readByte();
        }
    }

    private long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) {
        }
        ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') num = num * 10 + (b - '0');
            else return minus ? -num : num;
            b = readByte();
        }
    }

    void print(Object obj) {
        out.print(obj);
    }

    void println(Object obj) {
        out.println(obj);
    }

    void println() {
        out.println();
    }

    void printArray(int a[],int from){
        int l = a.length;
        for(int i=from;i<l;++i){
            print(a[i]);
            if(i!=l-1){
                print(" ");
            }
        }
        println();
    }

    void printArray(long a[],int from){
        int l = a.length;
        for(int i=from;i<l;++i){
            print(a[i]);
            if(i!=l-1){
                print(" ");
            }
        }
        println();
    }
}