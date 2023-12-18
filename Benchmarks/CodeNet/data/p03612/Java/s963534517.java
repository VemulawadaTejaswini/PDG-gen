import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] p_i = new int[N];
        
        boolean shouldSwap = false, shouldSwapBefore = false;
        int swapCount = 0;
        
        for(int i = 0; i < N; i++) {
            int p = scan.nextInt();
            p_i[i] = p;
            shouldSwap = (p == i+1 ? true : false);
            System.out.println(shouldSwap);
            
            if(i == 0 && shouldSwap) {
                swapCount++;
            } else if(!shouldSwapBefore && shouldSwap) {
                swapCount++;
            }
            shouldSwapBefore = shouldSwap;
        }
        
        System.out.println(swapCount);
    }
}
