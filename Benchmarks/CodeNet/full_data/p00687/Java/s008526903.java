import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int count = 0;
			int n = in.nextInt();
			int[]S = new int [1000001];
			int a = in.nextInt();
			int b = in.nextInt();
			if(n + a + b == 0) break;
			int idx;
			for(int i = 0;i < n;i++){
				if(a * i > n) break;
				for(int j = 0;j < n;j++){
					idx = a * i + b * j;
					if(idx < n){
						S[idx] = 1;
					}
					else break;
				}
			}
			for(int i = 0;i <= n;i++){
				count = count + S[i];
			}
			count = n - count;
			System.out.println(count);
		}
	}
}