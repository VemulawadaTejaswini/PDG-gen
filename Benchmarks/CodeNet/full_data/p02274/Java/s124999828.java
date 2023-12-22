import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        long count = 0l;
        long tempCount = 0l;

        for (int i = 0; i < A.length - 1; i++) {
            if (i != 0 && A[i] > A[i - 1]) {
                count += tempCount * 2;
                continue;
            } else {
                count += tempCount;
            }
            tempCount = 0;
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) tempCount++;
            }
        }
        
        System.out.println(count);
    }
}