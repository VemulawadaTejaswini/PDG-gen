import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		int total = 0;
		int ntotal = 0;
		int dataset = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			Scanner scstr = new Scanner(sc.nextLine());
			scstr.useDelimiter(",");
			
			int each = scstr.nextInt();
			int n = scstr.nextInt();
			if(each == 0 && n == 0) break;
			dataset++;
			total += subTotal(each, n);
			ntotal += n;
			scstr.close();
		}
		sc.close();
		System.out.println(total);
		System.out.println(average(ntotal, dataset));
	}
	
	static int subTotal(int each, int n) {
		return each * n;
	}
	
	static int average(int sum, int n) {
		float d = (float)sum / (float)n;
		return Math.round(d);
	}
}