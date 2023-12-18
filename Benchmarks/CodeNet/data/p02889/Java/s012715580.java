
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int m=sc.nextInt();
		int l=sc.nextInt();
		int[] a=new int[2*m];
		int[] b=new int[2*m];
		int[] c=new int[2*m];
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			b[m+i]=a[i];
			a[m+i]=b[i];
			c[m+i]=c[i];
		}
		int q=sc.nextInt();

		int[] t=new int[q];
		int[] s=new int[q];
		for(int i=0;i<q;i++) {
			t[i]=sc.nextInt();
			s[i]=sc.nextInt();
		}

		for(int i=0;i<q;i++) {
			//System.out.println("i="+i);
			System.out.println(TravelByCar(n,m,l,a,b,c,t[i],s[i]));
		}
	}

	private static int TravelByCar(int n, int m, int l, int[] a, int[] b, int[] c, int t, int s) {
		int r=0;
		int[] o=new int[n+1];
		int[] f=new int[n+1];
		int[] flag1=new int[n+1];
		int[] flag2=new int[n+1];
		for(int i=0;i<n+1;i++) {
			o[i]=n;
			f[i]=0;
			flag1[i]=0;
			flag2[i]=0;
		}
		o[t]=0;
		flag1[t]=1;
		f[t]=l;
		while(flagIsOn(flag1)) {
			//System.out.println("マップを更新します");
			for(int i=0;i<a.length;i++) {
				if(flag1[a[i]]==1 &&c[i]<=l) {
					if(c[i]>f[a[i]]) {
						if(o[b[i]]>o[a[i]]+1) {
							o[b[i]]=o[a[i]]+1;
							f[b[i]]=l-c[i];
							//System.out.println(b[i]+"に届きました。補給回数は"+o[b[i]]+"燃料は"+f[b[i]]+"です");
							//System.out.println(b[i]+"に届きました。");
							flag2[b[i]]=1;
						}else if(o[b[i]]==o[a[i]]+1 &&f[b[i]]<l-c[i]) {
							f[b[i]]=f[a[i]]-c[i];
							//System.out.println(b[i]+"に届きました。");
							flag2[b[i]]=1;
						}
					}else{
						if(o[b[i]]>o[a[i]]) {
							o[b[i]]=o[a[i]];
							f[b[i]]=f[a[i]]-c[i];
							//System.out.println(b[i]+"に届きました。補給回数は"+o[b[i]]+"燃料は"+f[b[i]]+"です");
							flag2[b[i]]=1;
						}else if(o[b[i]]==o[a[i]] && f[b[i]]<f[a[i]]-c[i]) {
							o[b[i]]=o[a[i]];
							f[b[i]]=f[a[i]]-c[i];
							//System.out.println(b[i]+"に届きました。補給回数は"+o[b[i]]+"燃料は"+f[b[i]]+"です");
							//System.out.println(b[i]+"に届きました。");
							flag2[b[i]]=1;
						}
					}
				}
			}
			for(int i=0;i<flag1.length;i++) {
				flag1[i]=flag2[i];
				flag2[i]=0;
			}
		}

		r=o[s];
		if(o[s]==n) {
			//System.out.println("届きませんでした。");
			return -1;
		}else {
			return r;
		}
	}

	private static boolean flagIsOn(int[] flag1) {
		for(int i=0;i<flag1.length;i++) {
			if(flag1[i]==1) {
				//System.out.println(i+"番目のフラグが立っています。");
				return true;
			}
		}
		return false;
	}

}
