import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int count = 0;
    
    for(int i = 1 ; i < N+1 ; i++){
      for(int j = 1 ; j < N+1 ; j++){
        int mod = i % j;
        if(mod >= K) count++;
      }
    }
    System.out.println(count);
  }
}
