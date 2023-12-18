import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N = in.i();
        int[] A = in.ii();
        int[] B = in.ii();
        int[] AA = A.clone();
        int[] BB = B.clone();
        Arrays.sort(AA);
        Arrays.sort(BB);
        boolean f = true;
        for(int i = 0; i < N; i++){
            if(AA[i] > BB[i]){
                f = false;
                break;
            }
        }
        if(f){
            for(int i = 0; i < N; i++){
                int a = A[i];
                int b = B[i];
                int id = Arrays.binarySearch(AA, a);
                f = false;
                for(int j = id; j > -1; j--){
                    if(A[j] != a) break;
                    if(BB[j] == B[j]){
                        f = true;
                        break;
                    }
                }
                if(!f){
                    for(int j = id+1; j < N; j++){
                        if(A[j] != a) break;
                        if(BB[j] == B[j]){
                            f = true;
                            break;
                        }
                    }
                }
                if(f){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
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
