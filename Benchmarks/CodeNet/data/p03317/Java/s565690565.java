import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		int ans = 1;
		N -= K;
		if(N >= 1) ans += (int)Math.ceil(1.0 * N / (K - 1));
		System.out.println(ans);
	}
}
