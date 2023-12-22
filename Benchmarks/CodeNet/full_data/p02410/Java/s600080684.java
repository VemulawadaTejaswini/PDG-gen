import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int []a = new int [100*n+m];
			
			for(int b=0;b<n;b++){
				for(int c=0;c<m;c++){
					a[100*b+c] = sc.nextInt();
				}
			}
			
			int []b = new int[m];
			for(int c=0;c<m;c++){
				b[c] = sc.nextInt();
			}
			
			
			for(int d=0;d<n;d++){
				int x=0;
				for(int c=0;c<m;c++){
					x=x+a[100*d+c]*b[c];
				}
				System.out.println(x);
			}
	}
}