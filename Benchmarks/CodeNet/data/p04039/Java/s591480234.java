/**
 * Created by iainws on 4/09/16.
 */

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.InputStream;

public class IrohasObsession {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReaderIrohasObsession in = new InputReaderIrohasObsession(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskIrohasObsession solver = new TaskIrohasObsession();
        solver.solve(1, in, out);
        out.close();
    }
}

class TaskIrohasObsession {

    public boolean check(int cur, int [] arr){
        boolean ok = true;
        while(cur != 0){
            int r = cur % 10;
            for(int i = 0; i < arr.length; ++i){
                if(arr[i] == r)ok = false;
            }
            cur /= 10;
        }
        if(ok)return true;
        return false;
    }

    public void solve(int taskNumber, InputReaderIrohasObsession in, PrintWriter out) {
        int N;
        int K;
        N = in.nextInt();
        K = in.nextInt();
        int [] arr = new int[K];
        for(int i = 0; i < K; ++i){
            int a = in.nextInt();
            arr[i] = a;
        }
        for(int i = N; i < N * 10;++i){
            if(check(i, arr)){
                System.out.println(i);
                return;
            }
        }
    }
}

class InputReaderIrohasObsession {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReaderIrohasObsession(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

}