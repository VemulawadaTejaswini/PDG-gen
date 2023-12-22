import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer;
		
		long start = System.currentTimeMillis();
		answer = fibonacci(n);
		System.out.println(answer);
		long end = System.currentTimeMillis();
		
		System.out.println(end - start + "ms");
	}
	
	public static int fibonacci(int n){
		/*switch(n){
			case 0: return 1;
			case 1: return 1;
			default: return fibonacci(n - 2) + fibonacci(n - 1);
		}*/
		
		if(n > 1) return fibonacci(n - 2) + fibonacci(n - 1);
		
		return 1;
	}
}