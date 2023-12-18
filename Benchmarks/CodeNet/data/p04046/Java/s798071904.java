import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height =sc.nextInt();
		int width = sc.nextInt();
		int fbh = sc.nextInt();
		int fbw = sc.nextInt();
		sc.close();
		long sum = 0;
		for(int i = 0; i < width - fbw; i++) {
			sum += comb(width + height - fbh -2 - i,width - i -1) * comb(fbh - 1 + i,i);
		}
		System.out.println(sum%(Math.pow(10,9) + 7));


	}
	public static long comb(int c,int r) {
		long result = factorial(c,1)/(factorial(c-r,1) * factorial(r,1));
		return result;
	}
	public static long factorial(int num,int result) {
		if(num <= 0) {
			return result;
		}
		return factorial(num-1,result*num);
	}
}