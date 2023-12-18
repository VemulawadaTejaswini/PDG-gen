import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		int x1,y1,x2,y2;
      	x1=reader.nextInt();
      y1=reader.nextInt();
      x2=reader.nextInt();
      y2=reader.nextInt();
      int diff_x=x2-x1;
      int diff_y=y2-y1;
      int x3 = x2 - diff_y;
    int y3 = y2 + diff_x;
    int x4 = x1 - diff_y;
    int y4 = y1 + diff_x;
    System.out.printf("%d %d %d %d",x3,y3,x4,y4);
    }

}