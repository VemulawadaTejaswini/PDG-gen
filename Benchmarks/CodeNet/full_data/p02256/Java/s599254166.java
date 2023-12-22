import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int i, j, k;
		int x = sc.nextInt();
		int xg[] = new int[x + 1];
		int y = sc.nextInt();
		int yg[] = new int[y + 1];
		int gcd = 0;
		
		for(i = 1; i <= x; i++){
			if(x % i == 0) xg[i] = 1;
			else xg[i] = 0;
		}
		
		for(i = 1; i <= y; i++){
			if(y % i == 0) yg[i] = 1;
			else yg[i] = 0;
		}
		if(x >= y){
			for(i = 1; i <= y; i++){
				if(xg[i] + yg[i] == 2) gcd = i;
			}
		}
		else{
			for(i = 1; i <= x; i++){
				if(xg[i] + yg[i] == 2) gcd = i;
			}
		}
		
		System.out.println(gcd);
	}

}
