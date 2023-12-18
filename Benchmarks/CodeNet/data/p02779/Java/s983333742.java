import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        int[] A = in.ii(N);
        Arrays.sort(A);
        int a = A[0];
        String ans = "YES";
        for(int i = 1; i < A.length; i++){
            if (A[i] == a) {
                ans = "NO";
                break;
            }
            a = A[i];
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

        int i() {
            return Integer.parseInt(s());
        }

        int[] ii(final int N) {
            int[] a = new int[N];
            int i = 0;
            String s = s();
            for (int j = 0; j < a.length; j++) {
                boolean minus = s.charAt(i) == '-';
                i += minus ? 1 : 0;
                int k = 0;
                while (true) {
                    try {
                        int h = s.charAt(i++) - '0';
                        if (h < 0 || 9 < h) break;
                        k = 10 * k + h;
                    } catch (Exception e) { break; }
                }
                a[j] = minus ? -k : k;
            }
            return a;
        }
    }
}
