import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primax = 50000;
		int[] pri = new int[primax+10000];
		for(int i=2;i<=primax;i++) pri[i] = i;
		for(int i=2;i<=primax+1;i++){
			for(int j=i+i;j<=primax;j+=i){
					pri[j]=0;
			}
		}
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int count = 0;
			for(int i=0;i<n/2;i++){
				if(pri[i]>0 && pri[n-i]>0) count++;
			}
			if(n%2==0 && pri[n/2]>0) count++;
			System.out.println(count);
		}	
	}	
}