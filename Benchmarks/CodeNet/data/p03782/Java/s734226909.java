import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = as.nextInt();
		int k = as.nextInt();
		int[] a;
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(as.next());
		}
		Arrays.sort(a); 
		int t = 0;
		for(int i=0;i<n;i++){
			t += a[i];
			if(k<=t){
				for(int s=0;s<n;s++){
					t -= a[s];
					if(k>t){
						t += a[s];
						for(int m=i;m>=s;m--){
							t -= a[m];
							if(k<=t){
								System.out.println(m+1);
								System.exit(0);
							}else{
								t += a[m];
							}
						}
						for(int q=s;q<n;q++){
							if(s==0)q++;
							if(a[q-1]!=a[q]){
								System.out.println(q);
								System.exit(0);
							}
						}
						System.out.println(s);
						System.exit(0);
					}
				}
			}
		}
		System.out.println(n);
	}
}