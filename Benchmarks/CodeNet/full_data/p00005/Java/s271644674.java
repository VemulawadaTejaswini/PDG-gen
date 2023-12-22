import java.util.Scanner;

public class Main {
	
	private static long commonDivisor(long a, long b){
		long r = a%b;
		if(r==0) return b;
		else return commonDivisor(Math.max(r, b), Math.min(r, b));
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
		long a, b, c;
		while(scan.hasNext()){
			a = scan.nextInt();
			b = scan.nextInt();
			if(b>a){
				c = a;
				a = b;
				b = c;
			}
			System.out.print(commonDivisor(a,b)+" "+commonMultiple(a,b)+"\n");
		}
	}
}