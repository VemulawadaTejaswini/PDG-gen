import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strA = br.readLine().split(" ");
        int[] A = Stream.of(strA).mapToInt(Integer::parseInt).toArray();
        
        double total = 0;
        for(int i = 0; i < N; i++){
            total += 1.0/A[i];
        }
        
        System.out.println(1.0/total);

    }
}
