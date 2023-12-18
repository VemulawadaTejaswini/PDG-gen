import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] inputArr = sc.nextLine().split(" ");
		sc.close();
		int h = Integer.parseInt(inputArr[0]);
		int w = Integer.parseInt(inputArr[1]);
		int a = Integer.parseInt(inputArr[2]);
		int b = Integer.parseInt(inputArr[3]);
		
		int hMinasB = h - b;
		int wMinasA = w - a;
		String zeroFirstStr = "";
		String oneFirstStr = "";
		for(int i = 0; i < wMinasA;i++) {
			zeroFirstStr += "0";
			oneFirstStr += "1"; 
		}
		for(int i = 0; i < a; i++) {
			zeroFirstStr += "1";
			oneFirstStr += "0";
		}
		
		for(int i = 0; i < b ; i++) {
			System.out.println(zeroFirstStr);
		}
		
		for(int i = 0; i < hMinasB; i++) {
			System.out.println(oneFirstStr);
		}
		
	}
}
