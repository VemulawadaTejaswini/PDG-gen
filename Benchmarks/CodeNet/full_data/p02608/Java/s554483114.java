
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int N=in.nextInt();
			int count=0;
			for(int i=1;i<=N;i++) {
				count=0;
				for(int x=1;x<=i;x++) {
					for(int y=1;y<=i;y++) {
						for(int z=1;z<=i;z++) {
							if(x*x+y*y+z*z+x*y+z*x+y*z==i) {
								count++;
							}
						}
					}
				}
				System.out.println(count);
			}
		}
	}
}
