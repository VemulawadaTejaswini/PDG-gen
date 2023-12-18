import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        num1 = n / 100;
        int reminder = n % 100;
        num2 = reminder / 10;
        reminder %= 10;
        num3 = reminder;
        int[] candidates = new int[3];
        candidates[0] = num1 * 100 + num1 * 10 + num1;
        candidates[1] = num2 * 100 + num2 * 10 + num2;
        candidates[2] = num3 * 100 + num3 * 10 + num3;
        Arrays.sort(candidates);
        for(int i = 0; i < candidates.length; i++) {
            if(candidates[i] >= n) {
                System.out.println(candidates[i]);
                return;
            }
        }
    }
}
