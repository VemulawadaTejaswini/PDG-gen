import java.io.*;
import java.lang;
public class RacoonMonster
  {
  public static void main (String [] args)
    {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the the value of Health and types of defeat");
    int a= sc.nextInt();
    int n= sc.nextInt();
    int arr= new int[n];
    int p= 0;
    System.out.println("enter all defeats");
 
    for(int i=0; i<n; i++)
      {
      arr[i]= sc.nextInt();
      p= p+ arr[i];
      }
    if(p== a)
      System.out.println("Yes");
    else
      System.out.println("No");
 }
  }

  