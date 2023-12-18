import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        ArrayList<String> s = new ArrayList<String>(),
        t = new ArrayList<String>();
        int N = r.i();
        for(int i = 0; i < N; i++)
            s.add(r.s());
        int M = r.i();
        for(int i = 0; i < M; i++)
            t.add(r.s());
        s.sort(null);
        t.sort(null);
        int max = 0;
        for(int i = 0; i < N; i++){
            String u = s.get(i);
            int sum = 1;
            while(i+1 < N && u.equals(s.get(i+1))){
                i++;
                sum++;
            }
            int j = t.indexOf(u);
            if(j > -1){
                sum--;
                while(j+1 < N && u.equals(t.get(j+1))){
                    j++;
                    sum--;
                }
            }
            if(max < sum)
                max = sum;
        }
        print(max);
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
