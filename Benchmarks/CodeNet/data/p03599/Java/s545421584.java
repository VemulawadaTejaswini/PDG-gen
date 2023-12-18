import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int E = sc.nextInt();
    int F = sc.nextInt();
    int ans1 = 100 * A;
    int ans2 = 0;
    boolean[] water = new boolean[F + 1];
    boolean[] sugar = new boolean[F + 1];
    for(int i = 1; i <= F; i++) {
      for(int j = 0; j <= 30; j++) {
        int d = i - (100 * A * j);
        if((d >= 0) && ((d % (100 * B)) == 0)) {
          water[i] = true;
          break;
        }
      }
    }
    for(int i = 1; i <= F; i++) {
      for(int j = 0; j <= F; j++) {
        int d = i - (C * j);
        if((d >= 0) && ((d % D) == 0)) {
          sugar[i] = true;
          break;
        }
      }
    }
    for(int i = 0; i <= F; i++) {
      for(int j = 0; j <= (F - i); j++) {
        if(water[i] && sugar[j]) {
          if((E * i) >= (100 * j)) {
            if((ans2 * (i + j)) < (ans1 * j)) {
               ans1 = i + j; 
               ans2 = j;
            }
          }
        }
      } 
    }
    System.out.println(ans1 + " " + ans2);
  }
}