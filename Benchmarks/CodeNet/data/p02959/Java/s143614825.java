import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strA = br.readLine().split(" ");
        String[] strB = br.readLine().split(" ");
        int[] A = Stream.of(strA).mapToInt(Integer::parseInt).toArray();
        int[] B = Stream.of(strB).mapToInt(Integer::parseInt).toArray();
        
        long monsters = 0;
        for(int i = 0; i < N; i++){
            int monster1 = Math.min(B[i], A[i]);
            A[i] -= monster1;
            B[i] -= monster1;
            monsters += monster1;
            
            if ( B[i] > 0 ){
                int monster2 = Math.min(B[i], A[i+1]);
                A[i+1] -= monster2;
                monsters += monster2;
            }
        }
        
        System.out.println(monsters);

    }
}
