import java.util.Scanner;
public class Main {
	
	public static boolean sosuu(int s) {
		for(int i=2; i*i<=s; i++) {
			if(s%i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n = sc.nextInt();
				if(n == 0) break;
				
				int count = 0;
				for(int i=n+1; i<=2*n; i++) {
					if(sosuu(i)) count++;
				}
				System.out.println(count);
			}
		}
	}
}

