import java.util.Scanner;

public class Main {
	
	private static long commonDivisor(long a, long b){
		long test = Math.min(a, b);
		while(test>1){
			if(a%test==0 && b%test==0)
				break;
			test--;
		}
		return test;
	}

	private static long commonMultiple(long a, long b){
		long max = Math.max(a, b);
		long min = Math.min(a, b);
		long i = 1;
		while(true){
			if(max*i%min==0)
				break;
			i++;
		}
		return max*i;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a, b;
		while(scan.hasNext()){
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.print(commonDivisor(a,b)+" "+commonMultiple(a,b)+"\n");
		}
	}
}