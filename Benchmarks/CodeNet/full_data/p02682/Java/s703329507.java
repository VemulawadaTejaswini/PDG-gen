import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();
		Integer k = sc.nextInt();
		
		Integer cNum = k - a - b;
		
		Integer result = a * 1 + cNum * (-1) ;   //計算結果
		
		System.out.println(result);
	}
}