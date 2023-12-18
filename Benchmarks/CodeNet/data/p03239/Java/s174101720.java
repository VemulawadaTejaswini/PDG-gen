import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();      
        int[] a = r.ii();
        int N = a[0],
            T = a[1],
            min = 1001;

        for(int i = 0; i < N; i++){
            a = r.ii();
            if(a[1] <= T){
                if(a[0] < min){
                    min = a[0];
                }
            }
        }        
        print(1000 < min ? "TLE" : String.valueOf(min));
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

        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }
    }
}