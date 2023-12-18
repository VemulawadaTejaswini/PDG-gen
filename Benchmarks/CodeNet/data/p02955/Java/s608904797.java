import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader rd = new MyReader();   
        int N, K; {int[] a = rd.ii(); N = a[0]; K = a[1];}
        int[] A = rd.ii();
        int sum = 0;
        for(int a : A)
            sum += a;
        ArrayList<Integer> list = new ArrayList<>();
        double root = Math.sqrt(sum);
        for(int i = 1; i < root; i++){
            if(sum%i == 0){
                list.add(list.size()/2, i);
                list.add(list.size()/2+1, sum/i);
            }
        }
        if(root%1 == 0)
            list.add(list.size()/2, (int)root);
        int size = list.size();
        for(int i = size-1; i >= 0; i--){
            int d = list.get(i);
            ArrayList<Integer> r = new ArrayList<>();
            for(int j = 0; j < N; j++){
                if(A[j]%d > 0)
                    r.add(A[j]%d);
            }
            r.sort(null);
            boolean flag = false;
            long left = 0;
            long right = (long)d*r.size();
            for(int ri : r)
                right -= ri;
            for(int j = 0; j < N-1; j++){
                left += r.get(j);
                right -= d-r.get(j);
                if(left <= K && right <= K){
                    flag = true;
                    break;
                }
            }
            if(flag){
                println(d);
                return;
            }
            
        }
         
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