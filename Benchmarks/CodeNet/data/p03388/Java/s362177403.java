import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String ls = System.lineSeparator();
		int q = in.nextInt();
		for(int i=0;i<q;i++) {
			long a = in.nextLong();
			long b = in.nextLong();
			long m = a*b;
			long k = (int)Math.sqrt(m);
			if(k*k>=m) k--;
			
			long sum = 0;
			if(k*(k+1)>=m) sum += 2*k-1;
			else sum += 2*k;
			
			if(Math.min(a, b)<=k) sum--;
			
			sb.append(sum);
			sb.append(ls);
		}
		System.out.println(sb.toString());
		in.close();
	} 
}