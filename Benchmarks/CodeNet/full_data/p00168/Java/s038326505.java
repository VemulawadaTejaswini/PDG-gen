import java.util.Scanner;

public class Main {
	
	static int step(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		if(n==3) {
			return 4;
		}
		return step(n-1)+step(n-2)+step(n-3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0) break;
			System.out.printf("%d\n",step(n)/3650+1);
		}
		
		
	}
}

