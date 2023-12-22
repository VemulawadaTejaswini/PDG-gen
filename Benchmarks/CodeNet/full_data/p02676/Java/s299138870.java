import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    String str = sc.nextLine();
    if(str.length() <= A)
    {
      System.out.println(str);
    }
     else
     {
       String s = str.substring(0,A);
       s = s+"...";
     }
  }
}
