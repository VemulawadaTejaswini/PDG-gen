
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    int R = sc.nextInt();
    int d = sc.nextInt();
    ini count = 0;
    
    for(int i = L / d; i < R ; i++)
    {
      if(i * d % R)
      {
          count += 1;
      }
    }
    
    System.out.println(count);
      
  }
}