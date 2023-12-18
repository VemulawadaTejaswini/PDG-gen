import java.util.Scanner; 
public class Main
{
public void static main(String arg[])
{
  Scanner sc = new Scanner(System.in); 
  String S = sc.nextLine();
  String T = sc.nextLine();
  if(S.length()>=T.length())
  {
    System.out.println(S+T);
  }
  else
    System.out.println(T+S);
}
}