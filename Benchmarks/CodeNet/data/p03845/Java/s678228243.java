import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		int n = in.nextInt() ;
		int t[] = new int[109] ;
		long res[] = new long[109] ;
		int k=0;
		long total = 0 ;
		for(int i=1;i<=n;i++) {
			t[i] = in.nextInt() ;
			total+=t[i];
		}
		int m = in.nextInt() ;
		for(int i=0;i<m;i++) {
			int p = in.nextInt() ;
			int x = in.nextInt() ;
			res[k++]=total+(x-t[p]);
		}
		for(int i=0;i<k;i++) {
			System.out.println(res[i]) ;
		}
	}

}
