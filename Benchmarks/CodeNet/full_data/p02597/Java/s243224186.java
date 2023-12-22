import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.nextLine());
    char[] c = sc.nextLine().toCharArray();
    
    int redCount = 0;
    
    for(int i = 0; i < N; ++i) {
      if(c[i] == 'R') ++redCount;
    }
    
    int whiteCount = 0;
    for(int i = 0; i < redCount; ++i) {
      if(c[i] == 'W') ++whiteCount;
    }
    
    System.out.println(whiteCount);
  }
}