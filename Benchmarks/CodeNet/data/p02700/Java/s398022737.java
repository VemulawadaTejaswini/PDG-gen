import java.util.*;
class Test{ 
  public static void main(String args[]) {
    Scanner s1 = new Scanner(System.in);
    int a = s1.nextInt();
    int b= s1.nextInt();
    int c = s1.nextInt();
    int d = s1.nextInt();
    int count =1;
    while(a>0 &; c>0) {
      if(count%2==1) 
        c = c - b;
      else 
        a = a - d;
      count++;
      }
    if(a>0) 
      System.out.println("Yes");
    else 
      System.out.println("No");
    }
  }
    