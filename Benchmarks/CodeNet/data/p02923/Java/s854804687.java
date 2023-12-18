import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int[] bruh = int[length];
    for(int i = 0; i < bruh.length; i++)
    	bruh[i] = sc.nextInt();
    int max = 0; 
    int mov = 0;
    for(int i = bruh.length-2; i >= 0; i--)
    {
      if(bruh[i+1] > bruh[i])
        p = 0;
      else
        p++;
      if(p > max)
        max = p;
    }
	System.out.println(p);
  }
}