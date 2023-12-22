import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] a = new int[2*n];
			int[] b = new int[2*n];
			for(int i=0;i<n;i++){
				a[sc.nextInt()-1]++;
			}
			for(int i=0;i<2*n;i++){
				if(a[i]==0)b[i]++;
			}
			
			boolean p = true;
			int ca = 0;
			int cb = 0;
			while(true){
				for(int i=0;i<2*n;i++){
					if(p==true && a[i]==1){
						p=false;
						a[i]--;
						ca++;
					}else if(p==false && b[i]==1){
						p=true;
						b[i]--;
						cb++;
					}
					if(ca==n || cb==n)break;
				}
				if(ca==n || cb==n){
					System.out.println(n-cb);
					System.out.println(n-ca);
					break;
				}
				if(p==true){
					p=false;
				}else if(p==false){
					p=true;
				}
			}
					
		}
	}
}