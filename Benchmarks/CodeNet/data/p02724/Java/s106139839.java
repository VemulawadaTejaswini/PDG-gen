import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int X = sc.nextInt();

        int a=X/500;
		int b=(X-500*a)/5;
		
      System.out.println(1000*a+5*b);
	}
}

