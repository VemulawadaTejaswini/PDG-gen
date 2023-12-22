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
				v=n-p+1;
				for(j=n-p+1;l<c;l++){
					copy[k++]=card[v--];
				}
				for(j=n-p+1;j<n-c;j++){
					card[j]=card[j+1];
				}
				for(l=0;l<c;l++){
					card[n-l]=copy[l];
				}
//				for(m=0;m<=n;m++){
//					System.out.println("card="+card[m]);
//				}
			}//r for
			System.out.println(card[n]);
		}//while
	}
}