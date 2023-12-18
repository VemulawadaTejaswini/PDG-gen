import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    List<Integer> array = new ArrayList<>();
    int[] ans;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ans = new int[N+1];

        array.add(1);

        for(int i=6; i<=N; i*=6){
            array.add(i);
        }

        for(int i=9; i<=N; i*=9){
            array.add(i);
        }

        Collections.sort(array);

        for(int i=0; i<=N; i++){
            ans[i] = 100000;
        }

        ans[0] = 0;

        for(int i=1; i<=N; i++){
            for(int j: array){
                if(i < j) break;
                ans[i] = Math.min(ans[i], ans[i - j]+1);
            }
        }

        System.out.println(ans[N]);
    }

}