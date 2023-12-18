import java.math.BigInteger;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    List<Integer> list = new ArrayList<>();
    int maxVal = 0;
    for (int i = 0; i < n; i++) {
      list.add(in.nextInt());
      maxVal = Math.max(maxVal, list.get(list.size() - 1));
    }
    int[] nums = new int[maxVal + 1];
    for (int listt : list) {
      nums[listt]++;
    }
    BigInteger prev = new BigInteger(String.valueOf(nums[0]));
    BigInteger r = BigInteger.ONE;
    for (int i = 1; i < nums.length; i++) {
      r = r.multiply(prev.pow(nums[i]));
      prev = new BigInteger(String.valueOf(nums[i]));
    }
    r = r.mod(new BigInteger("998244353"));
    System.out.print(r);
  }
}