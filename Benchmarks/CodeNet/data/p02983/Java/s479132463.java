import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int min = 2019;
		int mod = 0;
		for(int i = L; i < R; i++) {
			for(int j = i + 1;j <= R; j++) {
				mod = i * j % 2019;
				if(mod < min) min = mod;
			}
		}
		System.out.println(mod);
		sc.close();
	}
}