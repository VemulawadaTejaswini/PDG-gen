import java.util.Scanner;

class Solver{
	Scanner sc =new Scanner(System.in);
	
	
	void run(){
		int n = sc.nextInt();
		
		int e = 0;
		int w = 0;
		String buf  = sc.next();
		
		int[] ew = new int[n];
		int[] we = new int[n];

		int c = 0;
		for(char ch : buf.toCharArray()){
			if(ch == 'E'){
				e++;
			}else{
				w++;
			}
			ew[c] = w;
			we[c] = e;
			c++;
		}
		
		int res = we[n-1] - we[0];
		for(int i = 1; i < n ; i++){
			res = Math.min(res,ew[i-1] + we[n-1] - we[i]);
		}
		
		System.out.println(res);
		
	}
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
	}
}
