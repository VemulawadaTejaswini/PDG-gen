import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cities[] = new int[n];
		for(int i=0;i<n;i++){
			cities[i] = sc.nextInt();
		}
		int poyasimi = 0;
		for(int i=0;i<n-1;i++){
			int sub = cities[i+1]-cities[i];
			poyasimi += Math.min(a*sub, b);
		}
		System.out.println(poyasimi);
	}

}
