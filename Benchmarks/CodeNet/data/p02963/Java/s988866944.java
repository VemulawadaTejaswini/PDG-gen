import java.util.*;
public class Main{
  static long x1,x2,y1,y2,x3,y3;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    long a = 1;
    long n = 1000000000;
    while(true){
      if(s/a<=n){
        x1 = s/a;
        y2 = a;
        break;
      }
      a++;
    }
    System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3);
  } 
}