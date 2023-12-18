import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        int N = Integer.parseInt(in1[0]);
        long x = Long.parseLong(in1[1]);
        
        in1 = br.readLine().split(" ");
        long[] a = Stream.of(in1).mapToLong(Long::parseLong).toArray();
        br.close();

        long[] b = a.clone();
        long ans = 0L;
        for(int i = 0; i < N; i++){
            ans += b[i];
        }

        for(int i = 1; i < N; i++){
            for(int j = 0; j < N; j++){
                b[j] = Math.min(b[j], a[(j - i + N)%N]);
            }
            long tmp_ans = i * x;
            for(int j = 0; j < N; j++){
                tmp_ans += b[j];
            }
            ans = Math.min(ans, tmp_ans);
        }

        System.out.println(ans);
    }
}