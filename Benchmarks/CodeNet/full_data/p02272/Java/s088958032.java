import java.util.Scanner;

public class Main {
	public static int count=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, i;
		n = scan.nextInt();
		int[] s = new int[n];
		for (i = 0; i < n; i++) {
			s[i] = scan.nextInt();
		}
		margesort(s);
		scan.close();
		show(s);
		System.out.println(count);
	}
	public static void margesort(int[] a) {
		if(a.length>1) {
			int m,n;
			m=a.length/2;
			n=a.length-m;
			int[] a1=new int[m];
			int[] a2=new int[n];
			System.arraycopy(a, 0, a1, 0, m);
			System.arraycopy(a, m, a2, 0, n);
			margesort(a1);
			margesort(a2);
			marge(a1,a2,a);
		}
	}
	public static void marge(int[] a1,int[] a2,int[] a) {
		int i=0,j=0;
		while(i<a1.length || j<a2.length) {
			if(j>=a2.length || (i<a1.length && a1[i]<a2[j])) {
				a[i+j]=a1[i];
				i++;
			}
			else {
				a[i+j]=a2[j];
				j++;
			}
			count++;
		}
	}
	public static void show(int[] a) {
		int i;
		for(i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(a[a.length-1]+"");
	}
}
