import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        int in = 0;
        int out = 0;
        in = X*K;
        out = Y*(N-K);
        if(out <= 0){
            out = 0;
            in = X*N;
        }
        System.out.println(in+out);
    }
}