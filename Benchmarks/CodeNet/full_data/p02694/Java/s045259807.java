import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long X=sc.nextLong(), y=100;
    int z=0;
    while(y<X){
      y= y+ y/100;
      z++;
    }
    System.out.println(z);
  }
}