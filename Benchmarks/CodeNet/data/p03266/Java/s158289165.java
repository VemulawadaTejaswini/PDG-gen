import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int ans;

		if(k%2==0) {
			ans=motomeru(n, k)+motomeru(n+k/2, k);
		}
		else {
			ans=motomeru(n, k);
		}

		System.out.print(ans);
	}

	static int motomeru(int n, int t) {
		int kitei=n/t;

		return(kitei+3*kitei*(kitei-1)+kitei*(kitei-1)*(kitei-2));
	}


}
