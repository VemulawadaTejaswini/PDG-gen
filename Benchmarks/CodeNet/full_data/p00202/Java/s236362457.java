import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primax = 1000000;
		boolean[] pri = new boolean[primax+10000];
		for(int i=2;i<=primax;i++) pri[i] = true;
		for(int i=2;i<=primax+1;i++){
			for(int j=i+i;j<=primax;j+=i){
					pri[j]=false;
			}
		}
		
		while(true){
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n==0 && x==0) break;
			
			int[] a = new int[n];
			boolean[] f = new boolean[x+1];
			f[0] = true;
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				for(int j=a[i];j<=x;j+=a[i]){
					f[j] = true;
				}
			}
			
			int max = 0;
			for(int i=1;i<=x;i++){
				if(f[i]==false){
					for(int j=0;j<n;j++){
						if(i-a[j]>=0 && f[i-a[j]]==true){
							f[i] = true;
							break;
						}
					}
				}
				if(f[i]==true && pri[i]==true) max = i;
			}
			
			if(max==0) System.out.println("NA");
			else System.out.println(max);
		}	
	}	
}