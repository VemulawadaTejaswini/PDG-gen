import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		int A = sc.nextInt();
		int B = sc.nextInt();
		final HashSet<Integer> Aset = new HashSet<>();
		final HashSet<Integer> Bset = new HashSet<>();
		final int AMax = (int)Math.sqrt((double)A)+1;
		final int BMax = (int)Math.sqrt((double)B)+1;
		for(int i=2;i<AMax;i++) {
			if(A%i!=0) {
				continue;
			}
			Aset.add(i);
			A = A/i;
			while(A%i==0) {
				A = A/i;
			}
		}
		for(int i=2;i<BMax;i++) {
			if(B%i!=0) {
				continue;
			}
			Bset.add(i);
			B = B/i;
			while(B%i==0) {
				B = B/i;
			}
		}
		Aset.retainAll(Bset);
		out.println(Aset.size()+1);
	}

}
