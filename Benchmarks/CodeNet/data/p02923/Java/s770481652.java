import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] input = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<T; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        //계단 오르기
        int count = 0, max = 0;
        for(int i=0; i<T-1; i++) {
            count = 0;
            for(int j=i; j<T-1; j++) {
                if(input[j] >= input[j+1]) count++;
                else break;
            }
            max = Math.max(count, max);
        }
        System.out.print(max);
    }
}
