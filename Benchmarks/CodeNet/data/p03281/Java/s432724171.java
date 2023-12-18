import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
    for(int j = 1; j <= n; j += 2){
      int count = 0;
      for(int i = 1; i <= j; i += 2){
        if(j % i == 0)
          count++;
      }
      if(count == 8)
        result++;
    }
    System.out.println(result);
  }
}