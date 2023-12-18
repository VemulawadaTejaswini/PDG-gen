import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    
    for(int i=0; i <= N; i++) {
        for(int j = 0; j <= N - i; j++) {
            int c = N - i - j;
            int y = i*10000 + j*5000 + c*1000;
            
            if(y == Y) {
                System.out.println(i + " " + j + " " + c);
                return;
            }
        }
    }
    System.out.println("-1 -1 -1");
  }
}
