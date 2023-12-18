import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();  
        int M, X, ans = 0;
        {int[] a = r.ii(); M = a[1]; X = a[2];}
        int[] A = r.ii();
        for(int i = 0; i < M; i++){
            if(X < A[i]){
                ans = Math.min(i, M-i);
                break;
            }                 
        }
        print(ans);
    }

    static void print(Object o){
        System.out.println(o.toString());
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }

        String s() throws IOException{
            return readLine();
        }

        String[] ss() throws IOException{
            return s().split(" ");
        }

        int Int(String s){
            return Integer.parseInt(s);
        }

        int i() throws IOException{
            return Int(s());
        }

        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }
    }
}