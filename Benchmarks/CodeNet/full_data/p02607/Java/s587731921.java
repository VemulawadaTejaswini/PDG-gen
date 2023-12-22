import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
    for (int i=0;i<n;i++){
      int k = scan.nextInt();
      if (i%2 != 0){
        continue;
      }
      if (k%2 == 1){
        sum += 1;
      }
    }
    System.out.println(sum);
  }
}
