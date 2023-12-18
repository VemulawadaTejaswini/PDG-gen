import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = Integer.parseInt(as.next());
		int x = Integer.parseInt(as.next());
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(as.next());
		}
		int l=0;
		int c;
		for(int i=0;i<n-1;i++){
			c=a[i]+a[i+1];
			if(c>x){
				a[i+1]-=c-x;
				l+=c-x;
				if(a[i+1]<0){
					a[i]+=a[i+1];
					a[i+1]=0;
				}
			}
		}
		System.out.println(l);
	}
}