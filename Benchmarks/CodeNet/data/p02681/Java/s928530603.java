import java.util.Scanner;
class Solution
{
  public static void main(String[] args)
  {
  	Scanner sc= new Scanner(System.in);
    String S= sc.nextLine();
    String T= sc.nextLine();
    if(S.compareTo(T)==1)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
  
}