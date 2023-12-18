import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int N = Integer.parseInt(str);
		long[] a = new long[N];

		boolean frag=true;

		for (int i = 0; i < N; i++) {
			str = s.nextLine();
			a[i] = Long.parseLong(str);
		}
		double sum =0.0;
		for (int i = 0; i < N; i++) {
			sum += Math.floorMod(a[i],2);
		}
		if(Math.floorMod(Math.round(sum),2)==0.0)frag=false;

		if(frag){
			System.out.println("first");
		}else{
			System.out.println("second");
		}
	}
}