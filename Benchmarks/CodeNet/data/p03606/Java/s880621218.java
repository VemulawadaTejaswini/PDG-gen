import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] occupied = new int[100010];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = Integer.parseInt(line[0]); j <= Integer.parseInt(line[1]); j++) {
                occupied[j] = 1;
            }
        }
        
        for (int seat : occupied) {
            if (seat == 1) count++;
        }
        
        System.out.println(count);
    }
}
