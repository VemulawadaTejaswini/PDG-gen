import java.util.Scanner;
public class Main {
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
		for (int i=0;i<n;i++) {
			boolean d = true;
			for (int j=0;j<n;j++) {
				if (i==j) continue;
				if (a[i]%a[j]==0) {
					d=false;
					break;
				}
			}
			if (d) ans++;
		}
		System.out.println(ans);
	}
	sc.close();}}
