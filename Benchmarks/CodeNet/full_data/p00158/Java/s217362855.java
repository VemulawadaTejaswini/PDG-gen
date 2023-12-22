import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new aoj0158().doIt();
	}
	class aoj0158 {
		int gu(int n){
			return n/2;
		}
		
		int ki(int n){
			return (n*3)+1;
		}
		
		void doIt() {
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				int cnt = 0;
				while(true){
					if(n == 1)break;
					if(n % 2 == 0)n = gu(n);
					else n = ki(n);
					cnt++;
				}
				System.out.println(cnt);
			}
		}
	}
}