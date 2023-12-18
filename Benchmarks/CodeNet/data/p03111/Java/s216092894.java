import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c =sc.nextInt();
	    int[] d=new int[n];
		int ans=3000;
		for(int i = 0; i<n; i++){
			int l=sc.nextInt();
			d[i]=l;
		}
		for(int i = 0; i<Math.pow(2,n); i++){
			for(int j = 0; j<Math.pow(2,n); j++){
				int t=i;
				int y=j;
				int cost=0;
				int a1=0;
				int b1=0;
				int c1=0;
				for(int k=0; k<n; k++){
					if((t & 1)==1 && (y & 1)==1){
						if(a1!=0){
							cost+=10;
						}
						a1+=d[k]; 
					}else if((t & 1)==0 && (y & 1)==1){
						if(b1!=0){
							cost+=10;
						}
						b1+=d[k];
					}else if((t & 1)==1 && (y & 1)==0){
						if(c1!=0){
							cost+=10;
						}
						c1+=d[k];
					}
					t>>=1;
					y>>=1;
				}
				if(a1!=0 && b1!=0 && c1!=0){
					a1=Math.abs(a-a1);
					b1=Math.abs(b-b1);
					c1=Math.abs(c-c1);
					ans=Math.min(ans,cost+a1+b1+c1);
				}
			}
		}
		System.out.println(ans);
	}
}