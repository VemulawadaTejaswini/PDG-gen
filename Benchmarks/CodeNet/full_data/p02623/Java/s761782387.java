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
        int M = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        String[] A_array = br.readLine().split(" ");
        String[] B_array = br.readLine().split(" ");
  
        long result = 0;
        long A_total = 0;
        long B_total = 0;

        int A_books = 0;
        int B_books = 0;

        for(String str : B_array) {
            long tmp = Long.parseLong(str);
            if(B_total + tmp > K) break;
            B_total += tmp;
            B_books += 1;
        }

        result = B_books;

        for(int i = 0; i < N; i++) {
            A_total += Long.parseLong(A_array[i]);
            A_books += 1;

            while(A_total + B_total > K && B_books > 0) {
                B_total -= Long.parseLong(B_array[B_books - 1]);
                B_books -= 1;
            }

            if(A_total > K) break;
            if(A_books + B_books > result) result = A_books + B_books;

        }

        pw.println(result);
        br.close();
        pw.close();
    }
}