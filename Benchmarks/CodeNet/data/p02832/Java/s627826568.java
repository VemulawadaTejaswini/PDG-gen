import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] nums = new int[n];
    
    for (int i=0; i<n; i++) {
      nums[i] = sc.nextInt();
    }
    
    int min = n;
    for (int i=0; i<(Math.pow(2,n)); i++) {
      int now = 0;
      int count = 0;
      int breakFlg = 0;
      for (int j=0; j<n; j++) {
        if ((1&i>>j) == 1) {
          if (nums[j]!=now+1) {
            breakFlg = 1;
            break;
          }
          else {
          now = nums[j];
          }
        }
        else {
          count++;
        }
      }
      if (breakFlg == 0) {
        if (min>count) {
          min = count;
        }
      }
    }
    if (min==n) {
      min = -1;
    }
    System.out.println(min);
  }
}
