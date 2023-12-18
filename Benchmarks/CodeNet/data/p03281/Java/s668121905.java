import java.util.Scanner;

class ABC106B{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int count;
		for(int i = 3;i <= n; i += 2){
			count = 0;
			for(int j = 1;j <= n/2+1; j++){
				if(i%j==0) count++;
			}
			count++;
			if(count == 8) ans++;
		}
		System.out.println(ans);
	}
}