import java.util.*;
class  Main{
	Scanner sc= new Scanner(System.in);
	void aaaa(){
		int gundam=0;
		int n=sc.nextInt();
		int[] N=new int[n];
		for(int i=0;i<n;i++)N[i]=sc.nextInt();
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int Q=sc.nextInt();
			int l=L(n-1);
			int r=R(n-1);
			for(int j=0;j<n/2;j++){
				if(N[0]>Q||N[n-1]<Q){
					break;
				}else if(N[l]>Q){
					l=L(r);
					r=R(r);
				}else if(N[r]<Q){
					l=L(n-1+l);
					r=R(n-1+l);
				}else if(N[l]==Q||N[l]==Q){
					gundam++;
					break;
				}else break;
			}
		}
		System.out.println(gundam);
	}
	int R(int n){
		int l=n/2;
		int r=n-l;
		return r;
	}
	int L(int n){
		int l=n/2;
		return l;
	}
	public static void main(String[]args){
		new Main().aaaa();
		
	}
}