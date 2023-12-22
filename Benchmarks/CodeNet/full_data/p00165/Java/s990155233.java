import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pm = 1000002;
		boolean[] prime = new boolean[pm+100];
		for(int i=2;i<=pm;i++) prime[i] = true;
		for(int i=2;i<=pm+1;i++){
			for(int j=i+i;j<=pm;j+=i){
				prime[j]=false;
			}
		}
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int sum = 0;
			for(int i=0;i<n;i++){
				int p = sc.nextInt();
				int m = sc.nextInt();
				int x = 0;
				int max = Math.min(p+m, pm);
				int min = Math.max(p-m, 2);
				for(int j=min;j<=max;j++){
					if(prime[j]) x++;
				}
				if(x==0) sum--;
				else sum+=x-1;
			}
			System.out.println(sum);
		}
	}
}