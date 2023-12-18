import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int pos = 0, neg = 0, max = 0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			if(a[i]>0)
				pos++;
			if(a[i]<0)
				neg++;
			if(Math.abs(a[i])>a[max])
				max = i;
		}
		
		if(pos==0 && neg==0) {
			System.out.println(0);
		}
		else {
			int m = 0;
			StringBuilder ans = new StringBuilder();
			
			if(pos!=0 && neg!=0) {
				if(a[max]>0) {
					for(int i=0;i<n;i++) {
						if(a[i]<0) {
							a[i]+=a[max];
							m++;
							ans.append((max+1)+" "+(i+1)+"\n");
						}
					}
					neg = 0;
				}
				else {
					for(int i=0;i<n;i++) {
						if(a[i]>0) {
							a[i]+=a[max];
							m++;
							ans.append((max+1)+" "+(i+1)+"\n");
						}
					}
					pos = 0;
				}
			}
			
			if(pos==0) {
				for(int i=n-1;i>=1;i--) {
					if(a[i-1]>a[i]) {
						a[i-1]+=a[i];
						m++;
						ans.append((i+1)+" "+(i)+"\n");
					}
				}
			}
			else {
				for(int i=0;i<n-1;i++) {
					if(a[i]>a[i+1]) {
						a[i+1]+=a[i];
						m++;
						ans.append((i+1)+" "+(i+2)+"\n");
					}
				}
			}
			
			System.out.println(m);
			System.out.print(ans);
		}
	}
}
