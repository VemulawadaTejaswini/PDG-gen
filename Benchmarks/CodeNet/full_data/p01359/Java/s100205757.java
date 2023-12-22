import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int q = sc.nextInt();
			if(n==0 && q==0) break;
			
			String[] s = new String[n];
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i=0;i<n;i++){
				s[i] = sc.next();
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			
			boolean flag;
			int c;
			for(int i=0;i<q;i++){
				c = sc.nextInt();
				flag = false;
				for(int j=0;j<n;j++){
					if(b[j]-a[j]<c && c<=b[j]){
						for(int k=1;k<=a[j];k++){
							if(b[j]-a[j]+k==c){
								System.out.println(s[j] + " " + k);
								flag = true;
								j = n;
								break;
							}
						}
					}
				}
				if(flag==false) System.out.println("Unknown");
			}
		}
	}
}