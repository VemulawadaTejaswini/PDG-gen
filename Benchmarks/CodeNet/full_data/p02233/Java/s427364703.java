import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer;
		
		long start = System.currentTimeMillis();
		answer = fibonacci(n + 1);
		System.out.println(answer);
		long end = System.currentTimeMillis();
		
		System.out.println(end - start + "ms");
	}
	
	public static int fibonacci(int n){
		
		double gold = 1.618033988749895;
		
		int temp = (int) ((Math.pow(gold, n) - Math.pow(-gold, -n)) / Math.sqrt(5));
		
		return temp;
	}
} 