import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.err.println("starts...");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = k;
		for(int i = 1; i < n; i++){
			ans = ans * (k-1);
		}
		System.out.print(ans+"\n");
	}

}