import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int d,n;
		d = sc.nextInt();
		n = sc.nextInt();

		int ans = 100;
		if(d == 0){
			System.out.println(n);
		}else{
		for(int i = 0; i < d-1;i++){
			ans *=100;
		}
		System.out.println(n*ans);
		}
	}

}
