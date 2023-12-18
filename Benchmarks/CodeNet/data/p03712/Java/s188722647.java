import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();	//回数
		int W = sc.nextInt();	//K番目に小さいかず
		String[] str = new String[H];
		
		for (int i=0; i<H; i++){
			str[i] = sc.next();
		}
		
		for (int i=0; i<W+2; i++){
			System.out.print("*");
		}
		System.out.println("");
		
		for (int i=0; i<H; i++){
			System.out.print("*");
			System.out.print(str[i]);
			System.out.print("*");
			System.out.println("");
		}
		
		for (int i=0; i<W+2; i++){
			System.out.print("*");
		}
		System.out.println("");
		
	}

}
