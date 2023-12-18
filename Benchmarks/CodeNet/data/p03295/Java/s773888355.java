import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt();
		int[] a=new int[M+1];
		int[] b=new int[M+1];
		a[1]=0;
		b[1]=0;
		sc.nextLine();
		a[0]=sc.nextInt();
		b[0]=sc.nextInt();
		
		int ans=0;
		
		
		for(int i=1;i<M;i++){
			sc.nextLine();
			int c=sc.nextInt();
			int d=sc.nextInt();
			for(int k=0;a[k]==0;k++){
				if(a[k]<c&&d<b[k]){
					a[k]=c;
					b[k]=d;
					break;
				}else if(c<a[k]&&b[k]<d){
					break;
				}
				if(a[k+1]==0){
					a[k+1]=c;
					b[k+1]=d;
					a[k+2]=0;
					b[k+2]=0;
				}
			}
		}
		int cnt=0;
		for(int i=0;a[i]==0;i++){
			for(int k=i+1;a[k]==0;k++){
				if(a[k]<a[i]&&b[k]<b[i]){
					cnt=cnt+1;
					break;
				}
			}
			ans=ans+1;
		}
		ans=ans-cnt;
		System.out.println(ans);
	}
}
