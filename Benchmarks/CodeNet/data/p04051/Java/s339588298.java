import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];

		for(int i = 0;i<N;i++){
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();

		}
		int souwa = 0;
		int yasai = 0;
		int niku = 0;
		int souwa1 = 0;
		int yasai1 = 0;
		int niku1 = 0;
		int ans1 = 0;
		int ans2 = 0;
		for(int i = 0;i<N;i++){
			for(int j = i+1;j<N;j++){
				souwa = A[i]+B[i]+A[j]+B[j];
				yasai = A[i]+A[j];
				niku = B[i]+B[j];

				souwa1 = keisan(souwa);
				yasai1 = keisan(yasai);
				niku1 = keisan(niku);
				ans1 = souwa1/yasai1/niku1;
				ans2 += ans1;
			}


		}
		System.out.println(ans2%(1000000007));
	}
	public static int keisan(int a){
		int ans = 1;
		for(int i = 1; i<=a; i++){
			ans = ans*i;
		}
		return ans;
	}
}