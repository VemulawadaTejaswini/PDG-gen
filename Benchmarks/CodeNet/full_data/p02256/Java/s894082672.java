import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int tmp, remainder;
		int[] next = {0, 0};
		Scanner in = new Scanner(System.in);
		next[0] = Integer.parseInt(in.next());
		next[1] = Integer.parseInt(in.next());
		
		if(next[0] < next[1]){
			tmp = next[1];
			next[1] = next[0];
			next[0] = tmp;
		}
		int i = 1;
		while(i == 1){
			remainder = gcd(next[0], next[1]);
			if(remainder == 0){
				System.out.println(next[1]);
				System.exit(0);
			}
			next[0] = remainder;
			remainder = gcd(next[1], next[0]);
			if(remainder == 0){
				System.out.println(next[0]);
				System.exit(0);
			}
			next[1] = remainder;			
		}
	}	
			
	public static int gcd(int big, int small){
		int remainder = big % small;
		return remainder;	
	}
	
}
		