import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader in = new MyReader();
        final int INF = Integer.MAX_VALUE;
        
        int N = in.i();
        int SIZE = 1 << N;
        
        int[] s = in.ii();
        Arrays.sort(s);
        
        ArrayList<Integer> pp = new ArrayList<>();
        pp.add(s[SIZE-1]);
        
        s[SIZE-1] = INF;
        
        for(int j = 0; j < N; j++){
            pp.sort(null);
            int i = 1;
            ArrayList<Integer> np = (ArrayList<Integer>)pp.clone();
            while(!pp.isEmpty()){
                int p = pp.remove(0);
                while(true){
                    if(s[SIZE-1-i] < p){
                        np.add(s[SIZE-1-i]);
                        s[SIZE-1-i] = INF;
                        break;
                    } else 
                        i++;                    
                    if(i == SIZE){
                        println("No");
                        return;
                    }
                }
            }
            pp = np;
        }
        println("Yes");
    }

    static void print(Object o){
        System.out.print(o.toString());
    }

    static void println(Object o){
        System.out.println(o.toString());
    }

    static int Int(String s){
        return Integer.parseInt(s);
    }

    static long Long(String s){
        return Long.parseLong(s);
    }
    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s() throws IOException{
            return readLine();
        }

        String[] ss() throws IOException{
            return s().split(" ");
        }

        int i() throws IOException{
            return Int(s());
        }

        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        long l() throws IOException{
            return Long(s());
        }

        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
    }
}