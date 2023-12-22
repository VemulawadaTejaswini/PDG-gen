import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String[] tall_array = br.readLine().split(" ");
        int tmp = 0;
        long result = 0;

        for(int i = 0; i < N; i++) {

            int target = Integer.parseInt(tall_array[i]);

            if(target < tmp) {
                result += tmp - target;
            } else {
                tmp = target;
            }
        }

        pw.println(result);
        br.close();
        pw.close();
    }
}