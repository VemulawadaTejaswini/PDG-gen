import java.io.*;
import java.util.*;

class Main
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int t = sc.nextInt();
    int sandRemain = X - t;
    if (sandRemain < 0)
    {
      sandRemain = 0;
    }
    System.out.println(sandRemain);
  }
}
