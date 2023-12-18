import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M =sc.nextInt();
		int D = sc.nextInt();
		
		int count = 0;
		for(int i=1;i<=M;i++) {
			for(int p =1;p<D;p++) {
				int rOne = p%10;
				int rTen = p/10;
				if(rOne*rTen == i && rOne >=2 && rTen >=2) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		sc.close();	
	}
}