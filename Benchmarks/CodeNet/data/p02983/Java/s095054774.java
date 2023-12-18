import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int min = 2019;
		int mod = 0;
		for(int i = L; i < R; i++) {
			mod = i * (i + 1) % 2019;
			if(mod < min) min = mod;
		}
		System.out.println(min);
		sc.close();
	}
}