import java.util.Scanner;
class Main{
	Scanner sc = new Scanner(System.in);
	int n;
	int[] S;
	int q;
	int[] T;
	int C;
	int left;
	int right;
	int mid;
	void n(){
		n=sc.nextInt();
		S=new int[n];
		for(int i=0; i<n; i++){
			S[i]=sc.nextInt();
		}
		q=sc.nextInt();
		T=new int[q];
		for(int j=0; j<q; j++){
			T[j]=sc.nextInt();
		}
		
		for(int j=0; j<q; j++){
			left=0;
			right=n;
			while(left<right){
				mid=(left+right)/2;
				
				if(T[j]==S[mid]){
					C++;
					break;
				}else if(T[j]<S[mid]){
					right=mid;
				}else if(T[j]>S[mid]){
					left=mid+1;
				}
			}
		}
		System.out.println(C);
	}
	public static void main(String[]agrs){
		new Main().n();
	}
}