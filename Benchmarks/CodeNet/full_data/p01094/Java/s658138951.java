import java.util.*;
public class Main {
static Scanner inp=new Scanner(System.in);
static String c[]=new String [100000];
static String x[]=new String [100000];
static int a[]=new int[100000];
	public static void main(String args[]) {
		int n=inp.nextInt();
		while (n>0){
			int mx1=0;
			int mx2=0;
			for (int i=1;i<=28;i++)a[i]=0;
			for (int i=1;i<=n;i++)	
				c[i]=inp.next();
			for (int i=1;i<=n;i++){
				a[c[i].charAt(0)-64]++;
				x[c[i].charAt(0)-64]=c[i];
				mx1=0;
				mx2=0;
				for (int j=1;j<=28;j++){if (a[mx1]<a[j])mx1=j;}
				for (int j=1;j<=28;j++){if ((j!=mx1)&(a[mx2]<a[j]))mx2=j;}
				if (a[mx2]+n-i<a[mx1]){
					System.out.println(x[mx1]+" "+i);
					break;
				}
			}
			if (a[mx2]==a[mx1]) System.out.println("TIE");
			n=inp.nextInt();
		}
	}

}