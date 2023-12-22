import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int N=in.nextInt(),M=in.nextInt();
			if(N==0)break;
			int maxv[]=new int[M+1];
			for(int i=0;i<N;i++) {
				int d=Integer.parseInt(in.next()),v=Integer.parseInt(in.next());
				maxv[d]=Math.max(maxv[d], v);
			}
			int sum=0;
			for(int i=1;i<=M;i++)sum+=maxv[i];
			System.out.println(sum);
		}
	}
}

