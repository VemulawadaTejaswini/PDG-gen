import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static class WeightedUnionFind{
        int[] par; // ????????????
        int[] ws;  // ?????¨???????????????
         
        public WeightedUnionFind(int n){
            par = new int[n];
            ws  = new int[n];
            for(int i = 0; i < n; i++){ 
                par[i] = -1;
            }
        }
         
        public int find(int x){
            if(par[x] < 0){
                return x;
            }else{
                final int parent = find(par[x]);
                ws[x] += ws[par[x]];
                par[x] = parent;
                return parent;
            }
        }
         
        public int weight(int x){
            find(x);
            return ws[x];
        }
         
        public boolean union(int x, int y, int w){ // x <-(w)- y (x + w = y)
            w += weight(x);
            w -= weight(y);
            x = find(x);
            y = find(y);
             
            if(x != y){
                if(par[y] < par[x]) {  // ???????????????????????????????????????????????????.
                    int tmp = x; x = y; y = tmp;
                    w = -w;
                }
                par[x] += par[y];
                par[y] = x;
                ws[y] = w;
                 
                return true;
            }else{
                return false;
            }
        }
         
        public boolean same(int x, int y){
            return find(x) == find(y);
        }
         
        public Integer diff(int x, int y){ // x - y ????±???????. ??????????????????null.
            if(!same(x, y)){
                return null;
            }else{
                return this.weight(x) - this.weight(y);
            }
        }
         
        public int size(int x){
            return -par[find(x)];
        }
    }
     
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
 
        while(true){
            final int n = sc.nextInt();
            final int m = sc.nextInt();
             
            if(n == 0 && m == 0){
                break;
            }
             
            WeightedUnionFind uf = new WeightedUnionFind(n);
             
            for(int i = 0; i < m; i++){
                final char ops = sc.nextChar();
                 
                if('?' == ops){
                    final int r = sc.nextInt() - 1;
                    final int l = sc.nextInt() - 1;
                    final Integer ret = uf.diff(r, l);
                    System.out.println(ret == null ? "UNKNOWN" : -ret);
                }else{
                    final int r = sc.nextInt() - 1;
                    final int l = sc.nextInt() - 1;
                    final int w = sc.nextInt();
                     
                    uf.union(r, l, w);
                }
            }
        }
         
        sc.close();
    }
     
    public static class Scanner {
        private Reader br;
 
        public Scanner(InputStream is) throws IOException {
            br = new BufferedReader(new InputStreamReader(is));
        }
         
        public int nextInt() throws IOException {
            int sign = 1;
            int b = br.read();
             
            while(((b < '0') || ('9' < b)) && b != '-' && b != '+'){
                if(b == -1){ return 0; }
                b = br.read();
            }
             
            if(b == '-'){
                sign = -1;
                b = br.read();
            }else if(b == '+'){
                b = br.read();
            }
             
            int ret = b - '0';
            while(true){
                b = br.read();
                if(b < '0' || b > '9'){ return sign * ret; }
                ret *= 10;
                ret += b - '0';
            }
        }
         
        public char nextChar() throws IOException{
            int b = br.read();
            while(Character.isWhitespace(b)){
                b = br.read();
            }
            return (char)(b);
        }
         
        public void close() throws IOException {
            br.close();
        }
    }
}