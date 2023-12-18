
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	
	
	void run() {

		long n = sc.nextInt();
		long m = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		
		
		if(m > n){
			long swp = n;
			n = m;
			m = swp;
			String sw = s;
			s = t;
			t = sw;
		}
		
		for(long i = 1; ; i++){
			long l = n*i;
			
			if(l > n*m){
				System.out.println(-1);
				return;
			}
			
			if(l % m != 0){
				continue;
			}
			
			long xx = l / m;
			long yy = l / n;
			boolean ok = true;
			for(int j = 0 ; j < m ; j++){
				
				if( (xx * j) % yy == 0 ){
					if(t.charAt((int)j) != s.charAt((int)(xx*j/yy))){
						ok = false;
						break;
					};
				}
				
			}
			if(ok){
				System.out.println(l);
				return;
			}
		}
	}
}
