import java.util.Scanner;

public class Main {

	static int Merge(int A[],int left,int mid,int right){
		int n1=mid-left;
		int n2=right-mid;
		int i,j,k;
		int[] L=new int[n1+1];
		int[] R=new int[n2+1];

		for(i=0;i<n1;i++)L[i]=A[left+i];
		for(i=0;i<n2;i++)R[i]=A[mid+i];
		L[n1]=1000000000;
		R[n2]=1000000000;

		i=j=0;
		for(k=left;k<right;k++){
			if(L[i]<=R[j]){
				A[k]=L[i];
				i++;
			}else{
				A[k]=R[j];
				j++;
			}
		}
		return right-left;
	}

	static int Merge_Sort(int A[],int left,int right){
		int mid,res=0;
		if(left+1<right){
			mid=(left+right)/2;

			res+=Merge_Sort(A,left,mid);
			res+=Merge_Sort(A,mid,right);
			res+=Merge(A,left,mid,right);

		}
		return res;
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			int[] S=new int[n+1];
			for(int i=0; i<n; i++) {
				S[i]=sc.nextInt();
			}
			int x=Merge_Sort(S,0,n);

			for(int i=0;i<n;i++){
				if(i>0) System.out.print(" ");
				System.out.print(S[i]);
			}
			System.out.println();
			System.out.println(x);
		}

	}
}
