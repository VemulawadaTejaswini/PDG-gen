import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int W = sc.nextInt();
		if (S < 1 || S   > 100) {
			throw new IllegalArgumentException("不適切な値です");
		}
		else if(W < 1 || W > 100){
			throw new IllegalArgumentException("不適切な値です。");
		}
		if (S <= W){
			System.out.println("unsafe");
		}
		else{
			System.out.println("safe");
		}
	}
}
