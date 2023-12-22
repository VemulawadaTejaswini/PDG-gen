import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in); 
    int n  = sc.nextInt();
    
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    
    for(int i = 0; i <= n; i++)
    {
      String str = sc.nextLine();
     if(str.charAt(0) == 'A')
          b += 1;
      if(str.charAt(0) == 'W')
          c += 1;
      if(str.charAt(0) == 'T')
          d += 1;
      if(str.charAt(0) == 'R')
          e += 1;
    }
    System.out.println("AC = "+b);
    System.out.println("WA = "+c);
    System.out.println("TLE = "+d);
    System.out.println("RE = "+e);
  }
}                          
