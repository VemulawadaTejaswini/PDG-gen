import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static ArrayList<Integer> list=new ArrayList<>();
	static void eratos() {
		boolean[] prime=new boolean[10010];
		Arrays.fill(prime, true);
		for(int i=2; i<=10000; i++) {
			if(prime[i]) {
				list.add(i);
				for(int j=2; i*j<=10000; j++) {
					prime[i*j]=false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			eratos();
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				int s=0, t=0, sum=0;
				int count=0;
				for(;;) {
					while(t<list.size() && sum<n) {
						sum+=list.get(t);
						t++;
					}
					if(sum<n) break;
					if(sum==n) {
						count++;
					}
					sum-=list.get(s);
					s++;
				}
				System.out.println(count);
				
			}

		}
	}
}
