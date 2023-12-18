import java.util.Scanner;
class FrogA {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        int prev1_cost = 0;
        int prev2_cost = 0;
        for (int  i = 1; i < n; i++) {
            int temp = prev1_cost;
            prev1_cost = prev1_cost + Math.abs(h[i] - h[i-1]);
            prev2_cost = prev2_cost + Math.abs(h[i] - ((i-2 >= 0)?h[i-2]:Integer.MAX_VALUE));
            prev1_cost = Math.min(prev1_cost, prev2_cost);
            prev2_cost = temp;
        }
        System.out.println(prev1_cost);
    }
}
