import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		int n=in.nextInt(),A[]=new int[n];
		for(int i=0;i<n;i++)A[i]=in.nextInt();

		System.out.println(shellSort(A));
		for(int i=0;i<n;i++)System.out.println(A[i]);
	}

	static int shellSort(int[] A) {
		int cnt=0;
		
		List<Integer> H=setH(A.length);
		System.out.println(H.size());
		for(int i=0;i<H.size();i++) {
			if(i==H.size()-1)System.out.println(H.get(i));
			else System.out.print(H.get(i)+" ");
		}
		
		for(int i=0;i<H.size();i++) {
			cnt+=insertionSort(A,H.get(i));
		}
		
		return cnt;
	}

	static List<Integer> setH(int limit){
		List<Integer> H=new ArrayList<>();
		int h;
		for(h=1;h*3+1<limit;h=h*3+1);

		for(;h>0;h/=3) {
			H.add(h);
		}

		return H;
	}

	static int insertionSort(int[] A,int h) {
		int cnt=0;
		
		for(int i=h;i<A.length;i++) {
			int tmp=A[i],j;
			for(j=i; j>=h && tmp<A[j-h]; j-=h) {
				A[j]=A[j-h];
				cnt++;
			}
			A[j]=tmp;
			/*System.out.printf("A[%d]=%d\n",j,tmp);
			for(int k=0;k<A.length;k++) {
				if(k==A.length-1)System.out.println(A[k]);
				else System.out.print(A[k]+" ");
			}*/
		}
		return cnt;
	}

}

