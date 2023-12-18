import java.io.PrintWriter;
import java.util.*;

public class Main {
		public static void main(String[] args) {
			Scanner stdin = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
			
			int N = Integer.parseInt(stdin.next());
			int p[] = new int[N];
			int min = 50;
			int mini = 0;
			int max = 0;
			int maxi = 0;
			
			for(int i=0;i<N;i++) {
				p[i] = Integer.parseInt(stdin.next());
				if(min>p[i]) {
					min=p[i];
					mini=i;
				}
				if(max<p[i]) {
					max=p[i];
					maxi=i;
				}
			}
			
			int flag = 0;
			
			for(int i=0;i<N-1;i++) {
				if(p[i] <=p[i+1]) {
					flag = 1;
				}
				else {
					int sub = p[maxi];
					p[maxi] = p[mini];
					p[mini] = sub;
					for(int z=0;z<N-1;z++) {
						if(p[z] <=p[z+1]) {
							flag = 1;
						}
						else {
							flag=0;
							break;
						}
					}
					break;
				}
			}
			if(flag==1) {
				out.print("Yes");
			}
			else {
				out.print("No");
			}
			
			out.flush();
	}
}


