import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int r_s = -2;

    int x1 = 0;
    int y1 = 0;
    int x2 = 1000000000 ;
    int y2 = 1;
    int x3 ;
    int y3 ;

    //s=abs{(x2*y3-x3*y2)};

    int p = s/1000000000;
    int q = s - s/1000000000*p;

    x3 = 1000000000 - q;
    y3 = p + 1;
    System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3);


  }
}