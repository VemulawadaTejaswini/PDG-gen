import java.util.*;
public class Main {
	static final Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		int[] freq = new int[7];
		int n;
		while((n = stdin.nextInt()) != 0){
			Arrays.fill(freq, 0);
			while((n--)>0){
				int k = stdin.nextInt(), x;
				x = k<10 ? 0 : k<20 ? 1 : k<30 ? 2 : k<40 ? 3 : k<50 ? 4 : k<60 ? 5 : 6;
				freq[x]++;
			}
			for(int i: freq) System.out.println(i);
		}
	}
}