import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int e = sc.nextInt();
			if(e == 0) break;
			int m = 1<<29;
			for(int x=0;x<=e;x++) {
				for(int y=0;y<=(int)(Math.sqrt(e-x));y++) {
					int z = (int)(Math.pow(e-x-y*y,(1.0)/(3.0)));
					if(x+y*y+z*z*z == e && x+y+z<m) {
						m=x+y+z;
						System.err.println(x+" "+y+" "+z+" "+m);
					}
					
				}
			}
			System.out.println(m);
			
		}
	}
}
