import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt();
		for(int i=1;i<=N;i++) {
			int c=-1;
			int re=0;
			for(int x=1;c<=i;x++) {
				for(int y=x;c<=i;y++) {
					for(int z=y;c<=i;z++) {
						c=x*x+y*y+z*z+x*y+y*z+z*x;
						if(c>=i) {
							if(c==i) {
								if(x==y&y==z) {
									re=1;
								}else if((x!=y&&y==z)||(y!=z&&z==x)||(z!=x&&x==y)) {
									re=3;
								}else {
									re=6;
								}
							}
							break;
						}
						
					}
					if(x*x+y*y*3+x*y*2<=i) {
						c=0;
					}
				}
				if(6*x*x<=i) {
					c=0;
				}
			}
			System.out.println(re);
		}
	}

}