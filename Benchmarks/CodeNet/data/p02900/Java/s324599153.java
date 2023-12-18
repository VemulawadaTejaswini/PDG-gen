
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static long getGcd(long a, long b){
		if(a > b){
			return getGcd(b, a);
		}
		long c = b % a;
		if(c == 0){
			return a;
		}else{
			return getGcd(c, a);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long gcd = getGcd(a, b);
		LinkedList<Long> list = new LinkedList<>();
		for(long i = 2; i * i <= gcd; i++){
			list.add(i);
		}
		long count = 0;
		while(list.size() != 0){
			long n = list.pollFirst();
			for(long i = n * 2; i * i <= gcd; i = i + n){
				list.remove(i);
			}
			boolean flag = false;
			while(gcd % n == 0){
				flag = true;
				gcd /= n;
			}
			if(flag){
				count++;
			}
		}
		if(gcd != 1){
			count++;
		}
		System.out.println(count + 1);
	}
}

