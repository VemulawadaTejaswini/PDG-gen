import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int x1 = sc.nextInt();
      int y1 = sc.nextInt();
      int x2 = sc.nextInt();
      int y2 = sc.nextInt();
      int x3 = x2-y1+y2;
      int y3 = x1-x2+y2;
      int x4 = x1+y1-y2;
      int y4 = x2-x1+y1;
      System.out.println(x3);
      System.out.println(y3);
      System.out.println(x4);
      System.out.println(y4);
    }
}