import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    String a=input.next();
    if(a.length()==10)
    {
      if(a.contains("2017/01/"))
      {
        String temp=""+ a.charAt(8)+a.charAt(9);
        int tempa=Integer.parseInt(temp);
        if(tempa>=1 && tempa<=31)
        {
          a=a.replace("2017","2018");
          System.out.println(a);
        }
      }
    }
  }
}