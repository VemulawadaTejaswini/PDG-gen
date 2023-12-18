package atCoder01;
import java.util.Scanner;
//正解例
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int avarage = ((a + b + 1)/2);

		System.out.println(avarage);
	}
}