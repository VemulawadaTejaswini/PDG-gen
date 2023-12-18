import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader(); 

        int N = r.i();

        ArrayList<Integer> s = new ArrayList<>(1<<N);
        for(String i : r.ss())
            s.add(Integer.parseInt(i));
        ArrayList<Integer> list = new ArrayList<>(new HashSet<>(s));

        s.sort((x, y) -> -x+y);
        list.sort((x, y) -> -x+y);

        int[] leaf = {s.remove(0)};

        for(int h = 0; h < N; h++){
            int[] newLeaf = new int[leaf.length*2];
            int i = 0;
            for(int v : leaf){
                int w = s.get(0);
                if(w < v){
                    s.remove(0);
                    if(s.size() > 0 && s.get(0) != w)
                        list.remove(0);                    
                } else {                
                    try{
                        int id = Collections.binarySearch(s, list.get(1));
                        w = s.remove(id);
                        if(Collections.binarySearch(s, list.get(1)) < 0){
                            list.remove(1);
                        }
                    } catch(Exception e){
                        println("No");
                        return;
                    }             

                    newLeaf[i++] = v;
                    newLeaf[i++] = w;

                }        
                leaf = newLeaf;
            }
        }
        println("Yes");
    }

    static void printS(int[] s){
        StringBuilder sb = new StringBuilder();
        for(int i : s)
            sb.append(i).append(' ');
        println(sb);
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