import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,r,i,p,c,j,k,l,m,v;
		while(true){
			n=sc.nextInt();
			r=sc.nextInt();
			if(n==0 && r==0) break;
			int card[]=new int[n+1];
			int copy[]=new int[n+1];
			int ans[]=new int[n+1];
			for(i=0;i<n+1;i++)
				card[i]=i;
			for(i=0;i<r;i++){
				p=sc.nextInt();
				c=sc.nextInt();
				k=0;l=0;
				for(v=n-p+1;l<c;l++){
					copy[k++]=card[v--];
				}
				v=n-p-c+2;
				for(j=n-p+2;j<=n;j++){
					card[v++]=card[j];
				}
				for(l=0;l<c;l++){
					card[n-l]=copy[l];
				}
//				for(m=0;m<=n;m++){
//					System.out.println(m+1+" card= "+card[m]);
//				}
			}//r for
			System.out.println(card[n]);
		}//while
	}
}