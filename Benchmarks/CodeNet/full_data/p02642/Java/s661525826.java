import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static boolean dool(int a) {
		for (int i=3;i<=Math.sqrt(a);i+=2) {
			if (a%i==0) return false;
		}
		return true;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(),p=0,ans=0;
	int [] a = new int [n];
	for (int  i=0;i<n;i++) {
		a[i]=sc.nextInt();
		if (a[i]==1) p++;
	}
	if (p>0) System.out.println(p);
	else {
		Arrays.sort(a);
		for (int i=0;i<n;i++) {
			if (a[i]==0) continue;
			int y=a[i];
			for (int j=i+1;j<n;j++) {
				if (y==a[j]) {a[i]=0;a[j]=0;}
				else if (a[j]%y==0) a[j]=0;
			}
		}
		for (int i=0;i<n;i++) if(a[i]!=0) ans++;
		System.out.println(ans);
	}
	sc.close();}}