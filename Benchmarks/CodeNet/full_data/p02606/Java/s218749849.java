import java.util.Scanner;
 
public class Main {
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    int R = sc.nextInt();
    int d = sc.nextInt();
    int count = 0;
    
    int i = L / d;
    while(i * d <= R)
    {
 		i++;
    }
    System.out.println(i - L / d);
  }
}