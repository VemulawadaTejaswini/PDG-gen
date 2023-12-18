
import java.util.*;
public class Main {

	private static final int m = 0;
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
int 	n=sc.nextInt();
String s=sc.next();
char ss[]=(s+s.charAt(0)+s.charAt(1)).toCharArray();

int a[]=new int[n+2];  		// 0:sheep 1:wolf
for(int i=0;i<=1;i++) {
	for(int j=0;j<=1;j++) {
	a[0]=i;
	a[1]=j;
	for(int k=2;k<=n+1;k++) {
		if(a[k-1]==0) {
			//previous sheep
			a[k]=ss[k-1]=='o'?a[k-2]:(a[k-2]+1)%2;
		}else {
			a[k]=ss[k-1]=='x'?a[k-2]:(a[k-2]+1)%2;
		}
	}
	if(a[0]==a[n]&&a[1]==a[n+1]) {
		for(int  k=0;k<n;k++) {
			System.out.print(a[k]==0?'S':'W');
		}
		return;
	}

	}
}
System.out.println(-1);



}
	}
