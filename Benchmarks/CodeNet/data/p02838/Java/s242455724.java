import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] nums;
    nums = new long[n];
    for (int i=0; i<n; i++) {
      nums[i] = sc.nextLong();
    }
    long sum = 0;
    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        sum += nums[i]^nums[j];

      }
    }
    
    sum /= 2;
    if (sum>(int)Math.pow(10, 9)+7) {
      sum = sum %((int) Math.pow(10, 9)+7);
    }
    
    System.out.println(sum);
    
  }
  
  public static boolean chkIssue(int object, int bitNum, int bit) {
    if (bit == 1 ) {
      if ((1&(object>>bitNum))==1) {
        return true;
      }
      return false;
    }
    else {
      if ((1&(object>>bitNum))==0) {
        return true;
      }
    }
    return false;
    
  }
}
