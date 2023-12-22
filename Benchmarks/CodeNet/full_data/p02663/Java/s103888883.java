import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    int c = stdIn.nextInt();
    int d = stdIn.nextInt();
    int e = stdIn.nextInt();
    
    int hour = 0;
    int minute = 0;
    if(a <= c)
      hour = (c - a) * 60;
    else
      hour = ((24 - a) + c) * 60;
    if(d >= b)
      minute = (d - b);
    else
      minute = (60 - b) + d;
    
    if(hour + minute > e){
      System.out.println(hour + minute - e);
    }
    else
      System.out.println(0);
  }
}