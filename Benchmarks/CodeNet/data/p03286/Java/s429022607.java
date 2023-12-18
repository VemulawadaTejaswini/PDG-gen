import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    String ret = "";

    if (n == 0){
      System.out.println(0);
    }
    else if (n<0){
      long count = 2;
      long start = -1;
      long end = -2;
      int now = 1;
      while (end > n){
        count += 2;
        now = (int) count/2;
        end = cal1(now);
      }
      start = cal1(now-1) - 1;

      ret += "1";
      count -= 1;
      while (start > end){
        if (2*n > start + end){
          if (count%2 == 1){
            ret += "1";
          }
          else{
            ret += "0";
          }
          end = (long) (start+end)/2;
        }
        else{
          if (count%2 == 1){
            ret += "0";
          }
          else{
            ret += "1";
          }
          start = (long) (start+end)/2-1;
        }
        count -= 1;
      }
    }
    else{
      long count = 1;
      long start = 1;
      long end = 1;
      int now = 1;
      while (end < n){
        count += 2;
        now = (int) (count+1)/2;
        end = cal2(now);
      }
      start = cal2(now-1) + 1;

      ret += "1";
      count -= 1;
      while (start < end){
        if (2*n < start + end){
          if (count%2 == 0){
            ret += "1";
          }
          else{
            ret += "0";
          }
          end = (long) (start+end)/2;
        }
        else{
          if (count%2 == 0){
            ret += "0";
          }
          else{
            ret += "1";
          }
          start = (long) (start+end)/2+1;
        }
        count -= 1;
      }
    }
    System.out.println(ret);
  }

  static long cal1(int count){
    long a = fast(4, count);
    long b = (long) (a*2-2)/3;
    return -b;
  }

  static long cal2(int count){
    long a = fast(4, count);
    long b = (long) (a-1)/3;
    return b;
  }

  static long fast(long a, int b){
    long ret = 1;
    long base = a;

    while (b > 0){
      if ((b & 1) == 1){
        ret *= base;
      }
      base = base*base;
      b >>= 1;
    }
    return ret;
  }
}
