import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int[][] A = new int[3][];
        for(int i = 0; i < 3; i++){
            A[i] = in.ii();
        }
        int N = in.i();
        for(int i = 0; i < N; i++){
            int b = in.i();
            loop: for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    if(A[j][k] == b){
                        A[j][k] = 0;
                        break loop;
                    }
                }
            }
        }
        boolean flag = false;
        loop: for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(A[i][j] != 0){
                    continue loop;
                }
            }
            flag = true;
            break;
        }
        if(!flag){
            loop: for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(A[j][i] != 0){
                        continue loop;
                    }
                }
                flag = true;
                break;
            }
        }
        flag |= A[0][0] == 0 && A[1][1] == 0 && A[2][2] == 0 ||
        A[0][2] == 0 && A[1][1] == 0 && A[2][0] == 0;
        out.println(flag ? "Yes" : "No");
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
