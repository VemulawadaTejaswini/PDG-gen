import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] D = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); 
        
        Arrays.sort(D);
        
        System.out.println(D[N/2] - D[N/2-1]);

    }
}
