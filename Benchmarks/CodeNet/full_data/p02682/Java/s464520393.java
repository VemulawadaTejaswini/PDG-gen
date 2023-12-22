import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();
		Integer k = sc.nextInt();
		
		Integer cNum = k - a - b;
		
		Integer result = 0;
		if(cNum > 0) {
			result = a * 1 + cNum * (-1) ;
		} else {
			result = a * 1;
		}
		
		System.out.println(result);
	}
}