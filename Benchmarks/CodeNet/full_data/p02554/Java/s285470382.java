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

        long tmp = 0;
        long cut = 1000000000 + 7;
        // long cut = 7;

        for(int i = 0; i < N - 1; i++) {
            tmp = (tmp + 1) * 2;
            if(tmp > cut){
                tmp = tmp % cut;
            }
            // if(tmp == 2511445) {
            //     System.out.println("haitta");
            // }
        }

        tmp %= cut;
        
        pw.println(tmp);
        br.close();
        pw.close();
    }
}