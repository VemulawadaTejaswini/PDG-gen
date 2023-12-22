import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = Integer.parseInt(s.next());
		if(num == 1 || num == 0){
			System.out.println(1);
		}else{
			int fib = 1;
			int sub = 0;
			int sub2;
			for(int i = 0; i < num; i++){
				sub2 = fib;
				fib += sub;
				sub = sub2;
			}
			
			System.out.println(fib);
			
		}
	}

}