import java.util.*;

class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		long M = 0L;
		long A = 0L;
		long R = 0L;
		long C = 0L;
		long H = 0L;
		
		char initial ;
		for(int i = 0 ; i < N ; i ++){
			initial = sc.next().charAt(0);
			switch(initial){
			case 'M':
				M = M + 1L;
				break;
			case 'A':
				A = A + 1L;
				break;
			case 'R':
				R = R + 1L;
				break;
			case 'C':
				C = C + 1L;
				break;
			case 'H':
				H = H + 1L;
				break;
			}
		}
		
		long total = M*A*R + M*A*C + M*A*H + M*R*C + M*R*H + M*C*H + A*R*C + A*R*H + A*C*H ;
		
		System.out.println( total);
	}
}
