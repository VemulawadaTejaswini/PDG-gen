import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= d; j++){
				if(j%10>=2&&j/10>=2&&(j%10)*(j/10)==i){
					sum++;
				}
			}
		}
		System.out.print(sum);
	}
}
