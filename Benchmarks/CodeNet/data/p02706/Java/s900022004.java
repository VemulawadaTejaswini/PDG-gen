import java.util.Scanner;

public class Main{

	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		int summerlong = sc.nextInt();
		int hw = sc.nextInt();
		int[] hwArray = new int[hw];
		for(int i =0; i < hw;i++) {
			hwArray[i]=sc.nextInt();
		}
		int totalHw = 0;
		for(int i =0;i<hw;i++) {
			totalHw+=hwArray[i];
		}
		if(totalHw<=summerlong) {
			System.out.print(summerlong-totalHw);
		}else{
			System.out.print("-1");
		}
	}
}
