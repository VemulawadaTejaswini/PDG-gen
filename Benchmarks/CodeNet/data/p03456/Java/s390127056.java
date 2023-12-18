import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int lB=0;
		double sum;
		boolean ok=false;
		if(b / 100 > 0) {
			lB = 3;
		} else if(b / 10 > 0) {
			lB = 2;
		} else {
			lB = 1;
		}
		sum = a * (int)Math.pow(10, lB) + b;
		for(int i=0; i<500;i++) {
			if(sum==i*i) {
				System.out.println("Yes");
				ok=true;
				break;
			}
		}
		if(ok==false) {
		System.out.println("No");
		}

	}

}