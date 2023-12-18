;import java.io.*;
import java.lang;
public class MonsterDefeater
  {
  public static void main(String [] args)
    {
    Scanner sc= new Scanner();
  int h, a;
  System.out.println("Enter the health of monster"):
  h= sc.nextInt();
    System.out.println("Enter the attack");
    a= sc.nextInt();
    if(h% a==0)
      {
      System.out.println(h/a);
      }
      else
        {
        int c= h/a;
        System.out.println(c+1);
        }
      }
  }
      