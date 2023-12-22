import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			String[] s = new String[n];
			int[] a = new int[n];
			int[] b = new int[n];
			int t = 0;
			
			for(int i=0;i<n;i++){
				s[i] = sc.next();
				for(int j=0;j<n-1;j++){
					t = sc.nextInt();
					if(t==0){
						a[i] += 2;
					}else if(t==2){
						a[i] += 1;
					}
				}
			}
			b = Arrays.copyOf(a, n);
			Arrays.sort(b);
			
			for(int i=b[n-1];i>=0;i--){
				for(int j=0;j<n;j++){
					if(a[j]==i)System.out.println(s[j]);
				}
			}
			
		}
	
	}	
}