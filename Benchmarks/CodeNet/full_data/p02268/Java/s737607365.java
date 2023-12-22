import java.util.Scanner;
import java.util.Arrays;

class Main { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] S = new int[n];
        for (int i = 0; n != 0; i++) {
            S[i] = in.nextInt();
            n--;
        }
        
        int q = in.nextInt();
        int[] T = new int[q];
        for (int i = 0; q != 0; i++) {
            T[i] = in.nextInt();
            q--;
        }
        
        System.out.println(include(S, T));
    }
    
    static int include(int[] S, int[] T) {
        int count = 0;
        for (int i = 0; i < T.length; i++) {
            if (Arrays.binarySearch(S, T[i]) != - 1) count++;
        }
        return count;
    }
}