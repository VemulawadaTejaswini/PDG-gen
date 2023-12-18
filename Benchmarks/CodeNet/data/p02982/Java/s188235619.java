import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strND = br.readLine().split(" ");
        int N = Integer.parseInt(strND[0]);
        int D = Integer.parseInt(strND[1]);
        
        int[][] X = new int[N][D];
        
        for(int i = 0; i < N; i++){
            String[] strXi = br.readLine().split(" ");
            X[i] = Stream.of(strXi).mapToInt(Integer::parseInt).toArray();
        }
        int ans = 0;
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                
                int total = 0;
                for(int k = 0; k < D; k++){
                    total += Math.pow(Math.abs(X[i][k] - X[j][k]), 2);
                }
                
                double x = Math.sqrt(total);
                if ( x == (int) x ) ans++;
                
            }
        }
        
        System.out.println(ans);
    }
}
