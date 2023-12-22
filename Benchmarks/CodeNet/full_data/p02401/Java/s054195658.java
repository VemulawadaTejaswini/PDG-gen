import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
 
    while (true)
    {
      int operand1 = sc.nextInt();
      char operator = sc.nextChar();
      int operand2 = sc.nextInt();

      switch(operator)
      {
      case '+':
        System.out.println(operand1 + operand2);
        break;
      case '-':
        System.out.println(operand1 - operand2);
        break;
      case '*':
        System.out.println(operand1 * operand2);
        break;
      case '/':
        System.out.println(operand1 / operand2);
        break;
      case '?':
        return;
      }
    }
  }
}
