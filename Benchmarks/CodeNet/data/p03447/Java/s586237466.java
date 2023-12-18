import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int j = 0;
		for(int i = 0;i <= a;i++) { //500まで
			for(int s = 0;s <= b;s++) { //100まで
				for(int q = 0;q <= c;q++) { //50まで
					if(500 * i + 100 * s + 50 * q == x) {
						j++;
					}
				}
			}
		}
		System.out.println(j);	
	}
}
