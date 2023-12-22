import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			long x = sc.nextLong();
			if(x == 0) break;
			int sum = 0;
			while(true){
				sum += x%10;
				x = x/10;
				if(x<10){
					sum += x;
					break;
				}
			}
			System.out.println(sum);
		}
	}
}