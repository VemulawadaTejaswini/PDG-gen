import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] pri = new int[260000];
		for(int i=2;i<=250000;i++){
			pri[i] = i;
		}
		for(int i=2;i<=300000;i++){
			for(int j=i+i;j<=250000;j+=i){
					pri[j]=0;
			}
		}

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int sum=0;
			for(int i=n+1;i<=n+n;i++){
				if(pri[i]>0)sum++;
			}
			System.out.println(sum);
		}
	}
	
}