public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a[] = new int[s.nextInt()+1];
		int a2[]= new int[a.length];
		int b[] = new int[a.length-1];
		for(int i=0;i<a.length;i++) {
			a[i] =s.nextInt();
			a2[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			b[i] =s.nextInt();
		}
		int sum1 =0;
		for(int i=0;i<b.length;i++) {
			sum1 += strike(a,b,i);
		}
		int sum2=0;
		for(int i=b.length-1;i>=0;i--) {
			sum2 += strike2(a2,b,i);
		}
		System.out.println(Math.max(sum1, sum2));
	}
	public static int strike(int a[], int b[],int ind) {
		int cap=b[ind];
		if(a[ind]>=cap) {
			a[ind]-=cap;
			return cap;
		}else {
			int res = 0;
			cap-=a[ind];
			res+=a[ind];
			a[ind]=0;
			if(a[ind+1]>=cap) {
				a[ind+1]-=cap;
				return res + cap;
			}else {
				cap=0;
				res += a[ind+1];
				a[ind+1]=0;
				return res;
			}
		}
	}
	public static int strike2(int a[], int b[],int ind) {
		int cap=b[ind];
		if(a[ind+1]>=cap) {
			a[ind+1]-=cap;
			return cap;
		}else {
			int res = 0;
			cap-=a[ind+1];
			res+=a[ind+1];
			a[ind+1]=0;
			if(a[ind]>=cap) {
				a[ind]-=cap;
				return res + cap;
			}else {
				cap=0;
				res += a[ind];
				a[ind]=0;
				return res;
			}
		}
	}
}
