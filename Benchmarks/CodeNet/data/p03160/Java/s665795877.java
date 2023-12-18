

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author German le yo
 */
public class Main{
    
    static int[] stones;
    static int[] state;
    
    public static int getBest(int i){
        // Base case
        if(i <= 1) return state[i];
        // Verify if calculated before
        if(state[i] != 0) return state[i];
        
        // store and return the best
        return state[i] = Math.min(Math.abs(stones[i] - stones[i - 1]) + getBest(i - 1), Math.abs(stones[i] - stones[i - 2]) + getBest(i - 2));
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(scan.readLine());
        state = new int[N];
        stones = new int[N];
        
        String[] input = scan.readLine().split(" ");
        
        for(int i = 0; i < N; i++) stones[i] = Integer.parseInt(input[i]);
        
        // Base cases
        state[0] = 0;
        state[1] = Math.abs(stones[0] - stones[1]);
        System.out.println(getBest(N - 1));
    }
    
}
