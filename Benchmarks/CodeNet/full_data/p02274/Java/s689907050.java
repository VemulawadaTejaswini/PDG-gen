import java.util.Scanner;

public class Main{//Merge Sort
	static int N;
	static int[] A=new int[200010];
	static int[] W=new int[200010];
	static int merge_and_count(int l, int r) {
		if(l+1 >= r) return 0;
		if(l+2==r) {//要素2つだけ
			if(A[l]<=A[l+1]) return 0;
			int a=A[l];
			A[l]=A[l+1];
			A[l+1]=a;
			return 1;//逆転1つ
		}
		int m=(l+r)/2;
		int cl=merge_and_count(l, m);
		int cr=merge_and_count(m, r);
		int c=0;
		int i=l, j=m;
		int k=l;
		while(i<m && j<r) {//左グループ右グループ中身比較
			if(A[i]<=A[j]) {
				W[k++]=A[i++];
			}
			else {
				W[k++]=A[j++];
				c+=m-i;//左半分で未処理の要素とびこえる
				//System.out.println("j="+j+"m="+m+"c="+c);
			}
		}
		while(i<m) {
			W[k++]=A[i++];
		}
		while(j<r) {
			W[k++]=A[j++];
		}
		//System.out.println("W["+2+"]="+W[2]+"W["+3+"]="+W[3]+"W["+4+"]="+W[4]);
		assert(k==r);
		for(int x=l; x<r; x++) {
			A[x]=W[x];
		}
		return cl+cr+c;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			N=sc.nextInt();
			for(int i=0; i<N; i++) {
				A[i]=sc.nextInt();
			}
			System.out.println(merge_and_count(0, N));

		}
	}
}
