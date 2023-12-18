import java.util.*;

public class Main{
	/**
	 * @param arr the current permutation
	 * @return true if succeeded, else false
	 * @author http://expnotes9.blog.fc2.com/blog-entry-224.html
	 */
	public static boolean nextPermutation(int[] arr){
		int n=arr.length;
		if(n==0||n==1)
			return false;
		int m1=n-2;
		int m2=n-1;
		// m1: find rightmost increasing element
		while(m1 >= 0){
			if(arr[m1]<arr[m1+1])
				break;
			m1--;
		}
		// is the last permutation?
		if(m1<0)
			return false;
		// m2: find strictly greater element to the left of m1
		while(arr[m2]<=arr[m1])
			m2--;
		// swap the m1-th and m2-th elements.
		int tmp;
		tmp=arr[m1];
		arr[m1]=arr[m2];
		arr[m2]=tmp;
		// reverse elements between (j+1) and (n-1), inclusive.
		m2=n-1;
		for(++m1;m1<m2;++m1,--m2){
			tmp=arr[m1];
			arr[m1]=arr[m2];
			arr[m2]=tmp;
		}
		return true;
	}
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(), a=s.nextInt(), b=s.nextInt(), c=s.nextInt();
		int[] v=new int[n];
		Arrays.setAll(v,i->s.nextInt());
		Arrays.sort(v);
		int r=Integer.MAX_VALUE;
		do{
			for(int i=1;i<n;i++){
				for(int j=i+1;j<n;j++){
					for(int k=j+1;k<=n;k++){
						int ta=0, tb=0, tc=0;
						for(int ii=0;ii<k;ii++){
							if(ii<i)
								ta+=v[ii];
							else if(ii<j)
								tb+=v[ii];
							else
								tc+=v[ii];
						}
						r=Math.min(r,(k-3)*10+Math.abs(a-ta)+Math.abs(b-tb)+Math.abs(c-tc));
					}
				}
			}
		}while(nextPermutation(v));
		System.out.println(r);
	}
}
