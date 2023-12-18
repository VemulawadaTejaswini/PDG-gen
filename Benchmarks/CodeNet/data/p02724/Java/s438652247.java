import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		// 読み込み
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int a = (X / 500) * 1000;
      	int b = ((X % 500) / 5) * 5;
      
      	System.out.println(a + b);
	}
}