import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static class Solution {
        public void find(int reqA, int reqB, int[]A, int B[], int C[]) {
                Arrays.sort(A);
                Arrays.sort(B);

                int total = reqA + reqB + C.length;
                int[] arr = new int[total];
                //for(int i=0; i<=total; ) {
            int i= 0;
            int count = 0;
                    for(int j=A.length-1; j>=0 && count<reqA; j--) {
                        count++;
                        arr[i++] = A[j];
                    }

            count = 0;
                    for(int j=B.length-1; j>=0 && count<reqB; j--) {
                        arr[i++] = B[j];
                        count++;
                    }

                    for(int j=C.length-1; j>=0; j--) {
                        arr[i++] = C[j];
                    }
                //}
                Arrays.sort(arr);
                int res = 0;
                count = 0;
                for( i=arr.length-1; i>=0 && count< (reqA + reqB); i--) {
                    res += arr[i];
                    count++;
                }
                System.out.println(res);
        }

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int reqA = Integer.parseInt(s1[0]);
        int reqB = Integer.parseInt(s1[1]);
        int[]A = new int[Integer.parseInt(s1[2])];
        int[]B = new int[Integer.parseInt(s1[3])];
        int[]C = new int[Integer.parseInt(s1[4])];

        s = br.readLine();
        s1 = s.split(" ");
        for(int i=0; i<s1.length; i++) {
            A[i] = Integer.parseInt(s1[i]);
        }

        s = br.readLine();
        s1 = s.split(" ");
        for(int i=0; i<s1.length; i++) {
            B[i] = Integer.parseInt(s1[i]);
        }

        s = br.readLine();
        s1 = s.split(" ");
        for(int i=0; i<s1.length; i++) {
            C[i] = Integer.parseInt(s1[i]);
        }

        Solution sol = new Solution();
        sol.find(reqA, reqB, A, B, C);

    }
}
