import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int sum = 0;
		String reString = "";
		
		for(int i = 0; i < 2 ;i ++) {
			if(a > b) {
				sum = sum + a;
				a--;
			} else {
				sum = sum + b;
				b--;
			}
		}
		reString = "" + sum;
		System.out.println(reString);
	}
}