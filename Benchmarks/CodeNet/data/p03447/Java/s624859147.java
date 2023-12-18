import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Z = 0;
		for(int i=0;i<=A;i++) {//Aの加算
			for(int j = 0;j <= B;j++) {//Bの加算
				for(int k = 0;k <= C;k++) {//Cの加算
					if(500*i+100*j+50*k == X)Z += 1;					
				}
			}	
		}
		System.out.println(Z);
	}
}
