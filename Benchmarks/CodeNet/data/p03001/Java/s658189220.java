import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int W = sc.nextInt(); //X
		int H = sc.nextInt(); //Y
    int x = sc.nextInt();
    int y = sc.nextInt();

    double rectangle = W*H/2;
    System.out.printf("%f ", rectangle);
    if(W/2 == x && H/2 == y)
      System.out.println("1");
    else
      System.out.println("0");
	}
}