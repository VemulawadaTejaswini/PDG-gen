import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];

        int minA = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            minA = Math.min(A[i], minA);
        }

        int count = 0;

        boolean[] checked = new boolean[M+1];
        Arrays.fill(checked, false);
        
        loop: for (int candidate = minA / 2; candidate <= M; candidate++) {
            if(checked[candidate]) {
                continue loop;
            }
            
            for (int a : A) {
                if ((2 * candidate) % a != 0) {
                    continue loop;
                }
                if (((2 * candidate) / a - 1) % 2 != 0) {
                    continue loop;
                }
            }
            
            for(int i=1;i * candidate <=M; i +=2) {
                checked[i*candidate] = true;
                count++;
            }

        }

        System.out.println(count);
    }

}