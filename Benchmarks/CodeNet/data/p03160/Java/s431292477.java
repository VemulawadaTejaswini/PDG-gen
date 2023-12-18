import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int N = Integer.parseInt(br.readLine());
        String[] heightStrings = br.readLine().split(" ");
        int[] h = new int[N+1];
        h[0] = 0;
        for(int i=1;i<N+1;++i)
            h[i] = Integer.parseInt(heightStrings[i-1]);

        heightStrings = null;

        System.out.println(solution(N, h));
    }

    public static int solution(int N, int[] heights) {
        int[] A = new int[N+1];
        A[0] = 0;
        A[1] = heights[1-1];
        A[2] = Math.abs(heights[2] - heights[1]);

        for(int i=3;i<N+1;++i) {
            A[i] = Math.min(
                Math.abs(heights[i] - heights[i-1]) + A[i-1], 
                Math.abs(heights[i]-heights[i-2]) + A[i-2]
            );
        }

        return A[N];
    }
}