public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a[] = new int[s.nextInt()+1];
		int b[] = new int[a.length-1];
		for(int i=0;i<a.length;i++) {
			a[i] =s.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			b[i] =s.nextInt();
		}
		int sum =0;
		for(int i=0;i<b.length;i++) {
			sum += strike(a,b,i);
		}
		System.out.println(sum);
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
}
