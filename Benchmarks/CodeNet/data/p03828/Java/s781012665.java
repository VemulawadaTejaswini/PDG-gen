import java.util.*;
public class Main {
static int mod=(int)1e9+7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n+1];
Arrays.fill(arr,-1);
arr[0]=0;
arr[1]=0;
for(int i=2;i<=n;i++) {
	 
		if(arr[i]==-1) {
			for(int j=i*i;j<=n;j+=i) {
				arr[j]=0;
		}
	}
}
//for(int i:arr) {
//	System.out.println(i+" ");
//}

long ans=1;
for(int i=0;i<=n;i++) {
	if(arr[i]==-1) {
		int res=0;
		int temp=i;
		while(n>=temp) {
			res+=(n/temp);
			
			temp=temp*i;
		}
		
		ans=(ans*(res+1))%mod;
	}
	
	
	
}
System.out.println(ans);



}
}