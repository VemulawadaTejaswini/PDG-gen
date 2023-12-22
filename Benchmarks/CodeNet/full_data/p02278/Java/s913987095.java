import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
    	}
		System.out.println(minsort(a));
		
	}
	public static int myindex(int[] a,int b){
		for (int i=0;i<a.length;i++){
			if (a[i]==b) {
				return i;
			}
		}
		return -1;
	}
	public static int minsort(int[] a){
		int [] sorted=a.clone();
		Arrays.sort(sorted);
		int n=a.length;
		int cost=0;
		for (int i=0;i<n;i++){
			int cnt=0;
			int c1= myindex(a,sorted[i]);
			while (c1!=i){
				cnt++;
				int c2= myindex(a,sorted[c1]);
				cost+=a[c2];
				int work=a[c2];
				a[c2]=a[c1];
				a[c1]=work;
				c1=c2;
			}
			cost+=Math.min(sorted[i]*cnt, sorted[i]*2+sorted[0]*(cnt+2));
		}
		return cost;
	}
}