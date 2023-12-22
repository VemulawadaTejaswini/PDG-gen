import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in); 
    int a  = sc.nextInt();
    int r = a % 1000;
    int s = 1000 - r;
    if(s == 1000)
    {
    System.out.println("0");
    }
    else
    {
    System.out.println(s);
    }
  }
}                          
