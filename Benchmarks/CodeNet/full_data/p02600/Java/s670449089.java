import java.util.Scanner;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      if (x>=400 && x<=599)
      {
        System.out.println(8);
      }
      if (x>=600 && x<=799)
      {
        System.out.println(7);
      }if (x>=800 && x<=999)
      {
        System.out.println(6);
      }if (x>=1000 && x<=1199)
      {
        System.out.println(5);
      }if (x>=1200 && x<=1399)
      {
        System.out.println(4);
      }
      if (x>=1400 && x<=1599)
      {
        System.out.println(3);
      }
      if (x>=1600 && x<=1799)
      {
        System.out.println(2);
      }
      if (x>=1800 && x<=1999)
      {
        System.out.println(1);
      }
      
      
      
    }
}