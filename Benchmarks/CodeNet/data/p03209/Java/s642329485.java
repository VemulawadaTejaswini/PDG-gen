import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long x = scan.nextLong();

    long sum = 0;
    long start = 1;
    long end = find1(n);

    while (n >= 1){
      long mid = (long) (start+end)/2;
      if (x == start){
        break;
      }

      if (x == end){
        sum += 2*find2(n-1);
        sum += 1;
        break;
      }

      if (n == 1){
        sum += x-start;
        break;
      }

      if (x == mid){
        sum += 1;
        long add = find2(n-1);
        sum += add;
        System.out.println(sum);
        return;
      }

      if (x > mid){
        sum += 1;
        long add = find2(n-1);
        sum += add;
        start = mid+1;
        end -= 1;
      }
      else{
        end = mid-1;
        start += 1;
      }
      n -= 1;
    }
    System.out.println(sum);
  }

  static long find1(long n){
    long ret = 1;
    long base = 2;
    n += 2;
    while (n > 0){
      if ((n & 1) == 1){
        ret *= base;
      }
      base = base*base;
      n >>= 1;
    }
    ret -= 3;
    return ret;
  }

  static long find2(long n){
    long ret = 1;
    long base = 2;
    n += 1;
    while (n > 0){
      if ((n & 1) == 1){
        ret *= base;
      }
      base = base*base;
      n >>= 1;
    }
    ret -= 1;
    return ret;
  }
}
