import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		/*long n = Long.parseLong(as.next());
		long l = 0;
		if(n%2==0){
			l+=n/2;
		}else{
			l+=(n-1)/2;
		}
		for(int i=1;i<=n;i++){
			for(int s=0;s<i;s++){
				if(s+i<=n&&s+i+s<=n){
					l++;
					if(s+i+i<=n){
						l++;
					}
				}else{
					break;
				}
			}
		}
		l = l%(int)(Math.pow(10, 9)+7);
		System.out.println(l);*/
		int n = Integer.parseInt(as.next());
		int[] a;
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i]  = Integer.parseInt(as.next());
		}
		int[] t;
		t = new int[n];
		boolean s = true;
		long l = 0;
		if(n%2==0){
			for(int i=0;i<n-1;i+=2){
				t[i] = 0;
				t[i+1]  = 2;
			}
			for(int i=0;i<n;i++){
				t[a[i]] --;
			}
			for(int i=0;i<n;i++){
				if(t[i]<0){
					s = false;
					break;
				}
			}
			if(s){
				l = (long)Math.pow(2, n/2)%(int)(Math.pow(10, 9)+7);
			}
		}else{
			t[0] = 1;
			for(int i=1;i<n-1;i+=2){
				t[i] = 0;
				t[i+1]  = 2;
			}
			for(int i=0;i<n;i++){
				t[a[i]] --;
			}
			for(int i=0;i<n;i++){
				if(t[i]<0){
					s = false;
					break;
				}
			}
			if(s){
				l = (long)(Math.pow(2, (n-1)/2))%(int)(Math.pow(10, 9)+7);
			}
		}
		System.out.println(l);
		}
	}