import java.util.Arrays;
import java.util.Scanner;
 
class Main {
	int n;
	int l;
	String[] s;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		l = sc.nextInt();
		s = new String[n];
		for(int i=0;i<n;i++){
			s[i] = sc.next();
		}
	}
	void solve(){
		Arrays.sort(s);
		for(int i=0;i<n;i++){
			System.out.print(s[i]);
		}
	}
}