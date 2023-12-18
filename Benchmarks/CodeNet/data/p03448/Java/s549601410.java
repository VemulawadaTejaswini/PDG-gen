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
			int sum = A * i;
			if(sum == X) Z++;
			else if(sum > X)continue;
			else {
out:				for(int j = 0;j <= B;j++) {//Bの加算
					sum = sum + B * j;
					if(sum == X) Z++;
					else if(sum > X)break;
					else {
						for(int k = 0;k <= C;k++) {//Cの加算
							sum = sum + C * k;
							if(sum == X) Z++;
							else if(sum > X)break out;						
						}
					}
				}	
			}
		}
		System.out.println(Z);
	}