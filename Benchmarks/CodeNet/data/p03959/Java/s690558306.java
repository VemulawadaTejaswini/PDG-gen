import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long mod=1000000007;
			int n=sc.nextInt();
			int[] t=new int[n];
			int[] a=new int[n];
			for(int i=0;i<n;i++) t[i]=sc.nextInt();
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			long ans=1;
			if(t[n-1]!=a[0]) ans=0;
			long mt=t[0],ma=a[0];
			for(int i=1;i<n-1;i++){
				if(mt<t[i] || ma>a[i+1]){
					if(mt<t[i]) mt=t[i];
					if(ma>a[i+1]) ma=a[i+1];
				}
				else{
					ans*=Math.min(mt,ma);
				}
				ans%=mod;
			}
			System.out.println(ans);
		}
	}
}