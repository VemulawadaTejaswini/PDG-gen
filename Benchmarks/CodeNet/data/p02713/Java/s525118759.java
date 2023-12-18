import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String line = scanner.next();
    int N = Integer.parseInt(line);
    int sum = 0;
    for (int i =1; i<=K; i++){
      for (int j = 1; j<=K; j++){
        for (int l = 1; l<=K; l++){
          sum = sum + math.gcd(i,l,j);
        }
      }
    }
  }
} 
      