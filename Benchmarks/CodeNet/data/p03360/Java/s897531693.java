import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			int k = cin.nextInt();
			int maxn = Math.max(Math.max(a, b),c);
			int sum = a+b+c-maxn;
			for(int i=1;i<=k;++i){
				maxn *= 2;
			}
			sum += maxn;
			System.out.println(sum);
		}
	}
}

