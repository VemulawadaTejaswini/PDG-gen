import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    long[] nums = new long[n];
    for(int i = 0; i < n; i++) {
      nums[i] = sc.nextLong();
    }
    Arrays.sort(nums);
    double sum = 0;
    int[] occurs = new int[a];
    int count = 0;
    for(int i = n-1; i >= 0; i--) {
      if(i > n-a-1) {
        sum += nums[i];
      }
      if(count < a) {
        if(i != 0 && nums[i] != nums[i-1]) {
          occurs[count]++;
          count++;
        } else {
          occurs[count]++;
        }
      }
    }
    int numOfWays = 0;
    int sumCurr = 0;
    for(int i = 0; i < a; i++) {
      if(occurs[0] > a) {
        if(a > 1 && occurs[1] != 0)
          numOfWays = combinations(occurs[0], a);
        else{
          for(int j = a; j <= b; j++) {
            numOfWays += combinations(occurs[0], j);
          }
        }
        break;
      } else {
        sumCurr += occurs[i];
        if(sumCurr >= a) {
          //System.out.println(sumCurr);
          for(int j = a; j <= b; j++) {
            int r = j-sumCurr+occurs[i];
            if(r > occurs[i]) break;
            numOfWays += combinations(occurs[i], r);
          }
          break;
        }
      }
    }
    double ave = sum/a;
    System.out.println(ave);
    System.out.println(numOfWays);
  }
  
  private static int combinations(int n, int r) {
    return factorial(n)/(factorial(n-r)*factorial(r));
  }
  
  private static int factorial(int n) {
    if(n == 0 || n == 1) {
      return 1;
    }
    return n*factorial(n-1);
  }
}
