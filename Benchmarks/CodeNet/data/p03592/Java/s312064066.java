import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
		for(int i=-1; i<n; i++){
			for(int j=-1; j<m; j++){
				int num = (i+1)*m + (j+1)*n - (i+1)*(j+1)*2;
				if(k == num){
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
