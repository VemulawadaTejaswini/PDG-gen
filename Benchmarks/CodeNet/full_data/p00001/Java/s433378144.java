import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Calc calc = new Calc();
		int[] height = {2, 1, 0};
		int newh;
		for(int cnt = 1;cnt<10;cnt++){
			newh = sc.nextInt();
			height = Calc.calc(newh, height);
		};
		System.out.println(height[0]);
		System.out.println(height[1]);
		System.out.println(height[2]);
	}
}