import java.util.*;

public class Main {
	static final Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		int n=s.nextInt(),k=s.nextInt(),in[]=new int[n],count=n,sum=0;
		for(int i=0;i<n;i++) {
			in[i]=s.nextInt();
			sum+=in[i];
		}
		boolean a[] = new boolean[10001];
		for(int i=0;i<n;i++) {//card_i
			Arrays.fill(a, false);
			a[0]=true;
			for(int j=0;j<n;j++) if(j!=i) {//i以外のカードに対し
				for(int l=4999;l>=0;--l) {
					if(a[l])
						a[l+in[j]]=true;
				}
			}
			for(int j=Math.max(0,k-in[i]);j<k;j++) {
				if(a[j]) {
					count--;
					break;
				}
			}
		}

		System.out.println(count);
	}
}
