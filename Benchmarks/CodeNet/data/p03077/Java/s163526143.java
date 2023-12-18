import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        long N = r.l();
      	long[] capa = r.ll(5);
      	long[] city = new long[6];
      	city[0] = N;
      	long time;
        int minIdx = minIdx(capa);
        time = 5 + (N-1)/capa[minIdx];   
        print(time);
    }
    public static int minIdx(long[] capa){
        int idx = 0;
        long min = capa[0];
        for(int i = 1; i < 5; i++){
            if(capa[i] < min){
                min = capa[i];
                idx = i;
            }
        }
        return idx;
    }
    static void print(String s){
        System.out.println(s);
    }
    static void print(int i){
        System.out.println(i);
    }
    static void print(double d){
        System.out.println(d);
    }
    static void print(long l){
        System.out.println(l);
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return readLine().split(" ");
        }
        int i() throws IOException{
            return Integer.parseInt(readLine());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++){
                ii[j] = Integer.parseInt(ss[j]);
            }
            return ii;
        }
        int[] ii(int N) throws IOException{
            int[] ii = new int[N];
            for(int j = 0; j < N; j++){
                ii[j] = i();
            }
            return ii;
        }
        long l() throws IOException{
            return Long.parseLong(readLine());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++){
                ll[j] = Long.parseLong(ss[j]);
            }
            return ll;
        }
        long[] ll(int N) throws IOException{
            long[] ll = new long[N];
            for(int j = 0; j < N; j++){
                ll[j] = l();
            }
            return ll;
        }
    }
}