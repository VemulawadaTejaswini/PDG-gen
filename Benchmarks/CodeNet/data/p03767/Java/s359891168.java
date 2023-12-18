import java.util.Arrays;
import java.util.Scanner;
 
class Main {
	int n;
	int[] a;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		a = new int[3*n];
		for(int i=0;i<3*n;i++){
			a[i] = sc.nextInt();
		}
	}
	void solve(){
		Arrays.sort(a);
		long sum = 0;
		for(int i=0;i<n;i++){
			sum += a[3*n-2-2*i];
		}
		System.out.println(sum);
	}
}