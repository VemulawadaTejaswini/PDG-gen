import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner a = new Scanner(System.in);
    String input = a.nextLine();
    String[] spt = input.split(" ");
    int num1 = Integer.parseInt(spt[0]);
    int num2 = Integer.parseInt(spt[1]);
    System.out.println(num1 + num2);
  }
}
