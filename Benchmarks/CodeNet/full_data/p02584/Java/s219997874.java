import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long K = sc.nextLong();
    long D = sc.nextLong();
    long ans = X;
    if (X >= K*D) {
      ans = X-(K*D);
    } else {
      long a = X%D;
      if ((X/D)%2 == K%2) {
        ans = a; 
      } else {
        ans = (long)Math.abs(a-D); 
      }
    }
    System.out.println(ans);
  }
  
}