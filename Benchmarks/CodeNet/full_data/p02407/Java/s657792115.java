import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] linesp2 = line2.split(" ");
        for(int i = 0; i < n; i++) {
            int[] nums = new int[n];
            nums[i] = Integer.parseInt(linesp2[n - i - 1]);
            System.out.print(nums[i]);
            if(i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
