import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] input = rd.readLine().split(" ");
        int D = Integer.parseInt(input[0]); //콘센트 크기
        int K = Integer.parseInt(input[1]); //코드 수

        int result = 0, num = 0;
        while(result < K) {
            result = result + D;
            num++;
        }

        System.out.print(num);
    }
}
