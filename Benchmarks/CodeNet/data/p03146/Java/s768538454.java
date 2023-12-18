import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] memo = new int[1000000];
        calc(S, 0, memo);
    }

    public static void calc(int s, int index, int[] memo) {
        for (int i = 0; i<index-1; i++) {
          if (s == memo[i]) {
                System.out.println(index+1);
                return;
            }
        }

        if (s % 2 == 0){
            memo[index] = s/2;
        }        
        else {
            memo[index] = s*3 + 1;
        }
        calc(memo[index], index+1, memo);
    }
}