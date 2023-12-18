import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] nums = new int[N];
    for (int i = 0; i < N; i++) {
      nums[i] = sc.nextInt();
    }
    int[] newNums = new int[N];
    System.arraycopy(nums, 0, newNums, 0, N);
     Arrays.sort(newNums);
    
    for (int i = 0; i < N; i++) {
      if (nums[i] > newNums[N / 2 - 1]) {
        System.out.println(newNums[N / 2 - 1]);
      } else {
         System.out.println(newNums[N / 2]);
      }
    }  
  }
}