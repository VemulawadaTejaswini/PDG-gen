import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      for(int w = 1; w <= 3500; w++) {
        for(int h = 1; h <= 3500; h++) {
          if((4 * h * w - w * N - h * N) > 0 && 
            N * h * w % (4 * h * w - w * N - h * N) == 0) {
            System.out.println(w + " " + h + " " + (N * h * w / (4 * h * w - w * N - h * N)));
            return;
          }
        }
      }
      
  }
}