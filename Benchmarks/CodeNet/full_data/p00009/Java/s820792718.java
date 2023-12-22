import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static int countPrime(int n){
		int cnt = 0;
		if(n < 2){
			cnt = 0;
			return cnt;
		}
		if(n == 2){
			cnt++;
			return cnt;
		}
		if(n > 2)cnt++;
		for(int i = 3; i <= n; i += 2){
			for(int j = 3; j < i; j += 2){
				if(i % j == 0)break;
			}
			if(j == i)cnt++;
		}
		return cnt;
	}

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		int n = scan.nextInt();
		int cnt = countPrime(n);
		list.add(cnt);

		for(int n : list){
			System.out.printf("%d\n", n);
		}
	}
}