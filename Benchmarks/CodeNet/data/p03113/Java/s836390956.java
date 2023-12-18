import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int n,k;
	static int[] a=new int[55];
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		n=s.nextInt();
		k=s.nextInt();
		
		
		int mn=1000000;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			mn=Math.min(mn, a[i]-1);
		}
		
		if(mn<k) {
			System.out.println("-1");
			return;
		}
		
		ArrayList<Integer> ans=new ArrayList<>();
		
		while(true) {
			boolean ok=false;
			
			for(int i=0;i<n;i++) {
				if(a[i]!=0) {
					ans.add(i+1);
					a[i]--;
					ok=true;
				}
			}
			
			if(!ok) {
				break;
			}
		}
		
		System.out.println(ans.size());
		for(int i:ans) {
			System.out.print(i+" ");
		}
	}
}
