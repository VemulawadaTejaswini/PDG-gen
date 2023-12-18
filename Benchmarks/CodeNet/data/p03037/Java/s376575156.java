
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
       int n = sc.nextInt();
       int m = sc.nextInt();
	  int[]l = new int [m];
	  int[]r = new int [m];
	  int c =0;
	for(int i=0; i<m;i++) {
	  l[i] = sc.nextInt();
	  r[i] = sc.nextInt();
	}
	sc.close();
  for(int j=1; j<=n; j++) {
	int cc =0;
	  for(int i=0; i<m; i++) {
	 if(l[i]<=j&&j<=r[i]) {
		cc++;
	}
	 if(cc==m) {c++;}
}
}
	
  System.out.println(c);
	}

}