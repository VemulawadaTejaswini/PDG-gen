import java.util.Scanner;
class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.next());
			int[] a = new int[N];
			int sum=0;
			for(int i=0;i<N;i++){
				a[i] = Integer.parseInt(sc.next());
				sum+=a[i];
			}
			int[] countS=new int[N];
			for(int k=0;k<N;k++)countS[k]=0;
			for(int i=0;i<sum;i++){
				int max=0;
				int maxi=0;
				int subi=0;
				boolean isSubiExists=false;
				for(int k=0;k<N;k++){
					if(max==a[k]){
						subi=k;isSubiExists=true;
					}
					if(max<a[k]){
						max=a[k];maxi=k;
					}
				}
				
				if(max<=N){
					countS[maxi]++;
				}
				if(isSubiExists){
					a[subi]--;
				}else{
					a[maxi]--;
				}
				
			}
			for(int i=0;i<N;i++)System.out.println(countS[i]);
			
		}
	}
}