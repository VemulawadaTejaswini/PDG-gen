import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		
		while (cin.hasNext()){
			int n = cin.nextInt();
			calculation(n);
		}
	}
	
	public static void calculation(int n){
		int ans = 0;
		int a, b, c, d;
		
		for (a = 0; a < 10; a++){
			for (b = 0; b < 10; b++){
				for (c = 0; c < 10; c++){
					for (d = 0; d < 10; d++){
						if (a + b + c + d == n){
							ans++;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}