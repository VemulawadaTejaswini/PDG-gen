
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void debug(Object...os){
		System.err.println(deepToString(os));
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		for(;;){
			int n=sc.nextInt();
			int h=sc.nextInt();
			if(n==0 && h==0)return;
			boolean[][][] bs=new boolean[n][n][n];
			for(int l=0;l<h;l++){
				String s=sc.next();
				if(s.equals("xy")){
					int x=sc.nextInt()-1,y=sc.nextInt()-1;
					for(int i=0;i<n;i++){
						bs[x][y][i]=true;
					}
				}
				if(s.equals("xz")){
					int x=sc.nextInt()-1,y=sc.nextInt()-1;
					for(int i=0;i<n;i++){
						bs[x][i][y]=true;
					}
				}
				if(s.equals("yz")){
					int x=sc.nextInt()-1,y=sc.nextInt()-1;
					for(int i=0;i<n;i++){
						bs[i][x][y]=true;
					}
				}
			}
			int res=0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int j2 = 0; j2 < n; j2++) {
						if(!bs[i][j][j2])res++;
					}
				}
			}
			System.out.println(res);
		}
	}
}