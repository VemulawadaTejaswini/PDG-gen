import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int[] a = new int[n];
			int[] b = new int[n];
			
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				b[i] = 60*sc.nextInt() + sc.nextInt() + 60*sc.nextInt() + sc.nextInt()
						+ 60*sc.nextInt() + sc.nextInt() + 60*sc.nextInt() + sc.nextInt();
			}
			int[] c = b.clone();
			Arrays.sort(c);
			int[] ans = new int[3];

			for(int i=0;i<n;i++){
				if(b[i]==c[0]) ans[0] = a[i];
				else if(b[i]==c[1]) ans[1] = a[i];
				else if(b[i]==c[n-2]) ans[2] = a[i];
			}
			for(int i=0;i<3;i++) System.out.println(ans[i]);
		}
	}
}