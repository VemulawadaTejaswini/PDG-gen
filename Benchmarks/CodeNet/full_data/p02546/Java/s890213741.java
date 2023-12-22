import java.util.*;
class Main
{
	public static void main(String as[])
    {
		String a;
        Scanner sc=new Scanner(System.in);
      String es="es";
      String s="s";
      	a=sc.nextLine();
      if(a.charAt(a.length()-1)=='s')
      {
        a=a.substring(0,a.length()-1);
        a+=es;
      }
      else
        a+=s;
      System.out.println(a);
    }
}