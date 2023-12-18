import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int p[] = new int[N];
		int ans = 0;
		for(int i = 0; i < N; i++){
			p[i] = stdIn.nextInt();
			if(p[i]-i != 1){
				ans++;
			}
		}
		if(ans == 2 || ans == 0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		stdIn.close();
	}
}