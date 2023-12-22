import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int in = sc.nextInt();
			int out = 0;
			for (int i = 2; i <= in; i++){
				out = isPrime(i) ? out+1 : out;
			}
			System.out.println(out);
		}
	}
	
	private static boolean isPrime(int i){
		boolean res = false;
		
		if(i >= 2){
			boolean flag = false;
			for (int j = 2; j <= Math.sqrt(i); j++){
				flag = flag || (i%j == 0);
				
			}
			res = !flag;
		}
		return res;
	}
}