import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        int N = r.i();
        int[] a = r.ii();
        Arrays.sort(a); 
        
        int[] count = new int[100000];
        ArrayList<Integer> element = new ArrayList<>();
        for(int i = 0; i < N;){
            int temp = a[i];
            while(i < N && temp == a[i]){
                count[temp]++;
                i++;
            }       
            element.add(temp);
        }
        
        Iterator<Integer> iterator = element.iterator();
        int top = element.get(0);
        int ans = count[top];
        try{
            ans += count[top-1]+count[top+1];
        } catch(ArrayIndexOutOfBoundsException e){}
        
        while(iterator.hasNext()){
            int x = iterator.next();
            try{
                int temp = count[x-1]+count[x]+count[x+1];
                if(ans < temp)
                    ans = temp;
            } catch(ArrayIndexOutOfBoundsException e){}
        }
        println(ans);
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