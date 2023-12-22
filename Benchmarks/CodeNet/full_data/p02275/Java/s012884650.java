import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        int[] from = new int[n];
        int[] to = new int[n];

        int max = -1;

        for (int i = 0; i < n; i++) {
            from[i] = Integer.parseInt(input[i]);
            max = Math.max(from[i], max);
        }

        CountingSort(from, to, max);

        StringBuilder sb = new StringBuilder();
        sb.append(to[0]);

        for (int i = 1; i < n; i++) {
                sb.append(" " + to[i]);
        }

        System.out.println(sb);
    }

    static void CountingSort(int[] A, int[] B, int k) {
        int[] C = new int[k + 1];

        for (int i = 0; i < k + 1; i++) 
            C[i] = 0;
        
        for (int i = 0; i < A.length; i++) 
            C[A[i]]++;

        for (int i = 1; i < k + 1; i++) 
            C[i] += C[i - 1];
        
        for (int i = A.length - 1; i >= 0; i--){
            B[C[A[i]] - 1] = A[i];
            C[A[i]]--;
        }
        
    }

}
