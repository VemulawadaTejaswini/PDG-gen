import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int r=sc.nextInt();
				int n=sc.nextInt();
				int[] b=new int[83];
				if(r==0 && n==0)	break;
				for(int i=0; i<n; i++) {
					int lx=sc.nextInt();
					int rx=sc.nextInt();
					int h=sc.nextInt();
					for(int j=lx*2+41; j<=rx*2+40; j++) {//start endわけるために2倍
						b[j]=Math.max(b[j], h);
					}
				}//入力
				double t=1000000000.0;
				for(int i=0; i<=81; i++) {
					double x=(i/2)-20;
					if(r*r-x*x>0) {
						double y=b[i];
						t=Math.min(y+r-Math.sqrt(r*r-x*x), t);
					}
				}
				System.out.println(t);
			}
		}
	}
}
