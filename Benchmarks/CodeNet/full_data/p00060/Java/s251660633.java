import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int c1, c2, c3;
		int ans;
		
		while(scan.hasNextInt()){
			c1 = scan.nextInt();
			c2 = scan.nextInt();
			c3 = scan.nextInt();
			
			ans = 0;
			
			for(int i = 1; i <= 10; i++){
				if(i != c1 && i != c2 && i != c3){
					if(c1 + c2 + i <= 20)ans++;
				}
			}
			if(ans >= 4)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}