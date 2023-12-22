import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;//ScannerNXÌC|[g

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int[] a;
	//static int n;
	
	public static void main(String[] args) {
	//n = sc.nextInt();
	//while(n-- > 0 && read()) {
		read();
		solve();
		
		/*while(read()) {
			solve();
		}*/
		
	}
	
	static boolean read() {
	//±±ÅüÍðÇÝÞ
		a = new int[10];
		Scanner sc = new Scanner(System.in);	
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve() {
			//±±Åâèðð¢ÄoÍ·é
	sort(a);

	for(int i = 9; i > 6; i--){
		System.out.println(a[i]);
	}
	
	}
}