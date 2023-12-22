import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine());
    String str = scan.nextLine();
    String[] strs = str.split(" ");
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(strs[i]);
    }
    int count = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if(nums[i] == nums[j]) continue;
        for (int k = j + 1; k < n; k++) {
          if (nums[i] == nums[k] || nums[j] == nums[k]) continue;
          if(nums[i] + nums[j] <= nums[k] || nums[j] + nums[k] <= nums[i] || nums[i] + nums[k] <= nums[j]) continue;
//          System.out.println("(i,j,k) = (" + (i+1) + "," + (j+1) + "," + (k+1) + ")");
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
