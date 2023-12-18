import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N];
        int[] nums = new int[N+1];
        for (int i=0;i<N;i++) {
            D[i] = sc.nextInt();
        }
        Arrays.sort(D);

        for (int i=0;i<N;i++) {
            if (i%2==0) nums[i] = D[i];
            else nums[i] = 24-D[i];
        }

        int min = 100;
        for (int i=0;i<N+1;i++) {
            for (int j=i+1;j<N+1;j++) {
                min = Math.min(min, Math.max(nums[i], nums[j])-Math.min(nums[i], nums[j]));
            }
        }
        System.out.println(min);
    }
}