import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long result = 1l;
		for(int i = 0; i<n; i++)
			result *= sc.nextLong();

		if(result>(long)Math.pow(10,18))
			System.out.println(-1);
		else
			System.out.println(result);
	}
}