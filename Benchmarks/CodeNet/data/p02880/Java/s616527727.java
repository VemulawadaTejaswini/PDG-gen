import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean r = false;
		for(int i=1;i<=9;i++){
			if(n%i==0 && n/i<=9){
				r = true;
				break;
			}
		}
		System.out.println(r?"Yes":"No");
		sc.close();
	}
}
