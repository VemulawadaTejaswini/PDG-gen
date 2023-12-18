import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();  
        int N, K;
        {int[] a = r.ii(); N = a[0]; K = a[1];}
        String S = r.s();          
        int[] data = new int[N+2];
        int j = 0;
        int value = S.charAt(0)-'0';
        if(value == 0){
            data[j++] = 0;
        }
        for(int i = 0; i < N; value = 1-value){
            int count = 0;
            try{
                while(S.charAt(i)-'0' == value){
                    count++;
                    i++;
                }            
            } catch(StringIndexOutOfBoundsException e){}
            data[j++] = count;
        }
        if(value == 1)
            data[j++] = 0;
            
        int size = j,
            sum = 0;
        for(int i = 0; i < Math.min(2*K+1, size); i++)
            sum += data[i];
        
        int max = sum;
        for(int i = 3; i+2*K-1 < size; i += 2){
            sum += -data[i-3] - data[i-2] + data[i+2*(K-1)]+data[i+2*K-1];
            if(max < sum)
                max = sum;    
        }
        System.out.println(max);    
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
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }

        long l() throws IOException{
            return Long(s());
        }

        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long(ss[j]);            
            return ll;
        }
    }
}