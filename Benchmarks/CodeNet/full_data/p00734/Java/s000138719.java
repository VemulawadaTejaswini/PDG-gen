import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[],b[];
		int n,m,i,j=0,sum[]=new int[2],av,k;
		boolean flag;
		while(true){
			flag=true;
			sum[0]=sum[1]=0;
			n=sc.nextInt();
			m=sc.nextInt();
			if(n+m==0) break;
			a=new int[n];
			b=new int[m];
			for(i=0;i<n;i++){
				a[i]=sc.nextInt();
				sum[0]+=a[i];
			}
			for(i=0;i<m;i++){
				b[i]=sc.nextInt();
				sum[1]+=b[i];
			}
			if((sum[0]+sum[1])%2==1){
				System.out.println("-1");
			}
			else{
				av=(sum[0]+sum[1])/2;
				k=Math.abs(sum[0]-av);
				if(k==0){
					for(i=0;i<n;i++){
						for(j=0;j<m;j++){
							if(a[i]==b[j]){
								System.out.println(a[i]+" "+b[j]);
								flag=false;
								break;
							}
						}
						if(!flag){
							break;
						}
					}
					if(i+j==n+m){
						System.out.println("-1");
					}
				}
				else{
					for(i=0;i<n;i++){
						for(j=0;j<m;j++){
							if(Math.abs(a[i]-b[j])==k){
								System.out.println(a[i]+" "+b[j]);
								flag=false;
								break;
							}
						}
						if(!flag){
							break;
						}
					}
					if(i+j==n+m){
						System.out.println("-1");
					}
				}
			}
		}
	}
}