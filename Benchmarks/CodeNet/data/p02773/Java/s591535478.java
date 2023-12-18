import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        String[] S = new String[N];
        for(int i = 0; i < N; i++){
            S[i] = in.s();
        }
        Arrays.sort(S);
        int max = 0;
        String[] T = new String[N];
        int size = 0;
        for(int i = 0; i < N; ){
            int count = 0;
            String tmp = S[i];
            while(i < N && S[i].equals(tmp)){
                count++;
                i++;
            }
            if(max == count){
                T[size++] = tmp;
            } else if (max < count){
                size = 1;
                T[0] = tmp;
                max = count;
            }                
        }
        for(int i = 0; i < size; i++){
            out.println(T[i]);
        }
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        ArrayList<Integer> li(){
            String[] ss = ss();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) li.add(Integer.parseInt(ss[j]));
            return li;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
