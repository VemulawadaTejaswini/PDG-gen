
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	static int getGcd(int a, int b){
		if(a > b){
			return getGcd(b, a);
		}
		int c = b % a;
		if(c == 0){
			return a;
		}else{
			return getGcd(c, a);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = getGcd(a, b);
		TreeSet<Integer> set = new TreeSet<>();
		for(int i = 2; i <= gcd; i++){
			set.add(i);
		}
		int count = 0;
		while(gcd != 1){
			int n = set.pollFirst();
			for(int i = n * 2; i < gcd; i = i + n){
				set.remove(i);
			}
			while(gcd % n == 0){
				gcd /= n;
			}
			count++;
		}
		System.out.println(count + 1);
	}
}

