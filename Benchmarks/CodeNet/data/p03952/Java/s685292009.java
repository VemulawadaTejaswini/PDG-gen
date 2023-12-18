import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lineValue = line.split(" ");
        int N = Integer.parseInt(lineValue[0]);
        int s = Integer.parseInt(lineValue[1]);
        
        if(s == 2 * N - 1 || s == 1) {
            System.out.println("No");
            return;
        }
        
        System.out.println("Yes");
        
        int outputCount = 1;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < 2 * N - 1; i++) {
            if(i == N - 2) {
                sb.append(s - 1);
                sb.append("\r\n");
            } else if(i == N - 1) {
                sb.append(s);
                sb.append("\r\n");
            } else if(i == N) {
                sb.append(s + 1);
                sb.append("\r\n");
            } else {
                if(outputCount == s - 1) outputCount += 3;
                sb.append(outputCount++);
                sb.append("\r\n");
            }
        }
        System.out.println(sb.toString());
    }
}