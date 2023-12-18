import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        for(int i = 0; i < N; i++){
            long total = 0;
            int p = 1;
            for(int j = 0; j < N; j++){
                total += A[ (i+j) % N ] * p;
                p *= -1;
            }
            
            System.out.print(total);
            if (i != N-1 ) System.out.print(" ");
        }
        
    }
}
