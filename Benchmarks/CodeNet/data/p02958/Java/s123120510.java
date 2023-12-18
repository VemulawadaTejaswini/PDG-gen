import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int p[]=new int[N];
		for(int i=0;i<N;i++) {
			p[i]=sc.nextInt();
		}
		sc.close();
		int count=0;
		for(int j=0;j<N;j++) {
			if(p[j]!=(j+1)) {
				count++;
			}
		}
		if(count==0||count==2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}