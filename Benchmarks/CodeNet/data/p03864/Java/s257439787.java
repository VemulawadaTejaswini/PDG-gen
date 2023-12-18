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
		int l,s;
		l=s=0;
		int c;
		if(n%2==1){
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
		}else{
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
				if(c>x){
					a[i]-=c-x;
					s+=c-x;
					if(a[i]<0){
						a[i+1]+=a[i];
						a[i]=0;
					}
				}
			}
		}
		if(l>s){
			System.out.println(l);
		}else{
			System.out.println(s);
		}
	}
}