import java.util.Scanner;

/**
 *
 * @author German le yo
 */
public class Main{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int[] state = new int[N];
        int[] stones = new int[N];
        
        scan.nextLine();
        String[] input = scan.nextLine().split(" ");
        
        for(int i = 0; i < N; i++) stones[i] = Integer.parseInt(input[i]);
        
        state[0] = 0;
        state[1] = Math.abs(stones[0] - stones[1]);
        
        for(int i = 2; i < N; i++)
            state[i] = Math.min(Math.abs(stones[i] - stones[i - 1]) + state[i - 1], Math.abs(stones[i] - stones[i - 2]) + state[i - 2]);
        
        System.out.println(state[N - 1]);
        scan.close();
    }
    
}
