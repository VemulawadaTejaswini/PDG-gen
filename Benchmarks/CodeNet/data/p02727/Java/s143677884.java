import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int X, Y, A, B, C; {int[] a = in.ii(); X = a[0]; Y = a[1]; A = a[2]; B = a[3]; C = a[4];}
        int[] p = in.ii();
        int[] q = in.ii();
        int[] r = in.ii();
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        int[] ringo = new int[X + Y];
        int ai = A-X;
        int bi = B-Y;
        long ans = 0;
        for(int i = 0; i < ringo.length; i++){
            int a = p[ai];
            int b = q[bi];
            if(a < b){
                ans += ringo[i] = a;
                if(++ai == A){
                    for(int j = i+1; j < ringo.length; j++){
                        ans += ringo[j] = q[bi++];
                    }
                    break;
                }
            } else {
                ans += ringo[i] = b;
                if(++bi == B){
                    for(int j = i+1; j < ringo.length; j++){
                        ans += ringo[j] = p[ai++];
                    }
                    break;
                }
            }
        }
        int max = r[r.length-1];
        int ii = 0;
        while(ii < ringo.length){
            if(ringo[ii] < max) {
                ii++;
            } else {
                break;
            }
        }
        int ri = r.length - 1;
        for(int i = ii-1; i >= 0 && ri >= 0; i--){
            if(ringo[i] < r[ri]){
                ans  = ans - ringo[i] + r[ri];
                ri--;
            }
        }
        out.println(ans);
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
