import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    int xx=x2-x;
    int yy=y2-y;
    int x3=x2-yy;
    int y3=y2+xx;
    int x4=x3-xx;
    int y4=y3-yy;

    System.out.println(x3+" "+y3+" "+x4+" "+y4);


    sc.close();

  }
}