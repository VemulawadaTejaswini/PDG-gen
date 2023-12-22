import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long n2 = n;

		String s = "abcdefghijklmnopqrstuvwxyz";
		String result = "";
		long dig = 1;
		int ml = 1;
		for(;;) {
			ml *= 26;
			if(n2 <= ml)
				break;
			n2 -= ml;
			dig++;
		}
		for(int i = 0 ; i < dig ; i++) {
			ml /= 26;
			if(ml != 1) {
			long k = 0;
			if(n2 >= ml)
			 k = n2 / ml;

			result += s.charAt((int) (k));
			n2 -= (n2 / ml) * ml;
			}
			else {
				long j = 0;
			if(n2 >= ml)
			 j = n2 / ml;

			result += s.charAt((int) (j - 1));
			n2 -= (n2 / ml) * ml;
			}

		}
		System.out.println(result);

	}
	public static long pow(long ml, long a, long b){
	    if(b == 1)
	      return ml;
	      ml *= a;
	      b--;
			return b == 0 ? ml : pow(ml , a ,b);
		}
}

