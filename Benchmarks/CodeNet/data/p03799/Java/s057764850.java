import java.util.*;
public class puzzle_1 {
	public static int readint()
	{
		Scanner s = new Scanner(System.in);
		return s.nextInt();			//s.nextInt();
	}
	
	public static void main(String[] args) {
		long N, M;
		long p;
		N = readint();
		M = readint();
		if(M >= (2 * N))
			p = N + (M - 2*N)/4;
		else
			p = M/2;
		System.out.println(p);
	}	
}