import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x, i = 1;
		while(true){
			x = i;
			if (x % 3 == 0) System.out.printf(" %d", i);
			else{
				while (true){
					if (x % 10 == 3){ System.out.printf(" %d", i); break;}
					else{ x /= 10; if (x == 0) break;}
				}
			}
			if (++i <= n) continue;
			else break;
		}
	}
}