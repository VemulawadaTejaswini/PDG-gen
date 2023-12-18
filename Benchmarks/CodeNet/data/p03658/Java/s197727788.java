import java.util.Arrays;
import java.util.Scanner;
 
class Main {
	int n;
	int k;
	int[] l;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		k = sc.nextInt();
		l = new int[n];
		for(int i=0;i<n;i++){
			l[i] = sc.nextInt();
		}
	}
	void solve(){
		Arrays.sort(l);
		int sum = 0;
		for(int i=0;i<k;i++){
			sum += l[n-1-i];
		}
		System.out.println(sum);
	}
}