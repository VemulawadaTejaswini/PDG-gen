import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String line1 = sc.nextLine();
      String line2 = sc.nextLine();
      String[] line3 = line1.split(" ",0);
      String[] line4 = line2.split(" ",0);
      int H = Integer.parseInt(line3[0]);
      int W = Integer.parseInt(line3[1]);
      int h = Integer.parseInt(line4[0]);
      int w = Integer.parseInt(line4[1]);
      System.out.println((H-h)*(W-w));
    }
}