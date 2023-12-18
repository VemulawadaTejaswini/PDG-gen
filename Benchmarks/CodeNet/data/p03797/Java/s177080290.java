import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        long n = Long.parseLong(in[0]);
        long m = Long.parseLong(in[1]);
        long answer = 0;
        while(true) {
            if(n >= 1 && m >= 2) {
                n -= 1;
                m -= 2;
                answer ++;
            } else if(m >= 4) {
                m -= 4;
                answer ++;
            } else {
                break;
            }
        }
        System.out.println(answer);
    }
}