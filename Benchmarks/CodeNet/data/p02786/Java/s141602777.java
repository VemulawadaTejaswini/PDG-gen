import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		h = calc(h);
		System.out.println(h);
	}
	public static long calc(long h){
		long res = 1;
		if(h > 1){
			res = 1 + 2 * calc(h / 2);
		}
		return res;
	}
}