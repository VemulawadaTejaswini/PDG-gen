import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		if(x == n){
			System.out.println("YES");
			for(int i = 1;i <= 2*n-1;i++){
				System.out.println(i);
			}
		}else{
			System.out.println("NO");
		}
	}
}