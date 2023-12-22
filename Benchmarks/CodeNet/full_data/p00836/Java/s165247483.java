import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] pri = new boolean[10001];
		for(int i=2;i<10001;i++) pri[i] = true;
		for(int i=2;i<10001;i++){
			for(int j=i+i;j<10001;j+=i){
					pri[j]=false;
			}
		}

		int[] m = new int[1229];
		int sum = 0;
		for(int i=2;i<10001;i++){
			if(pri[i]==true){
				m[sum] = i;
				sum++;
			}
		}
		
		int[] ans = new int[10001];
		for(int i=0;i<1229;i++){
			sum = 0;
			for(int j=i;j>=0;j--){
				sum += m[j];
				if(sum>10000) break;
				ans[sum]++;
			}
		}
		
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			System.out.println(ans[n]);
		}
	}
	
}