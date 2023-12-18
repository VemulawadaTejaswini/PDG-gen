import java.util.Scanner;

public class Main{

    public static void main(String args[]){
		solve();
    }
	
	private static void solve(){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < N; i++){
			sum += sc.nextInt();
			if(sum > H)break;
		}
		System.out.println(sum >= H ? "Yes" : "No");
	}
}