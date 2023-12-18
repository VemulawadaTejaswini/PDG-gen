import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力受取
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line1 = input.readLine();

        int N = Integer.parseInt(line1);
        int[] A = new int[N];
        for(int i=0;i<N;i++) A[i] = Integer.parseInt(input.readLine());

        for(int i=0;i<N;i++) {
            int max = 0;
            for(int j=0;j<N;j++) {
                if(i==j) continue;
                if(max<=A[j]) max = A[j];
            }
            System.out.println(max);
        }

    }
}
