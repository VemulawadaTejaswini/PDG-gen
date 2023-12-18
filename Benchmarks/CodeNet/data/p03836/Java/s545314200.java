import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int sx = sc.nextInt();
    int sy = sc.nextInt();
    int tx = sc.nextInt();
    int ty = sc.nextInt();
    int N = (tx - sx)+ (ty - sy);
    for (int i =0; i<N; i++) {
      if(i < (ty - sy)) {
        System.out.print('U');
        continue;
      }
      System.out.print('R');
    }
    for (int i =0; i<N; i++) {
      if(i < (ty - sy)) {
        System.out.print('D');
        continue;
      }
      System.out.print('L');
    }
    System.out.print('L');
    System.out.print('U');     
    for (int i =0; i<N; i++) {
      if(i < (ty - sy)) {
        System.out.print('U');
        continue;
      }
      System.out.print('R');
    }
    System.out.print('R');
    System.out.print('D');     
    System.out.print('R');
    System.out.print('D');     
    for (int i =0; i<N; i++) {
      if(i < (ty - sy)) {
        System.out.print('D');
        continue;
      }
      System.out.print('L');
    }
    System.out.print('L');
    System.out.print('U'); 
  }
}