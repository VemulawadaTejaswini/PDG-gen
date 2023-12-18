import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private Set<String> set = new HashSet<String>();
	public static void main(String[] args) {
		int N,M;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int a[][] = new int[N][N];
		for (int i=0;i<M;i++) {
			int x,y;
			x= sc.nextInt();
			y= sc.nextInt();
			a[x-1][y-1]=1;
			a[y-1][x-1]=1;
		}
		Main main = new Main();
		boolean status[] = new boolean[N];
		int b[] = new int[N];
		for (int i=0;i<N;i++) {
			status[i] = false;
		}
		for (int i=0;i<N;i++) {
			main.countPattern(a,1,status,b,i,N);
		}
		System.out.println(main.set.size());
	}
	public void countPattern(int a[][],int number,boolean[] status,int b[],int nowPoint,int N) {
		status[nowPoint]=true;
		b[number-1] =nowPoint;
		boolean temp[];
		if (number==N) {
			String s=new String();
			for (int i=N-1;i>=0;i--) {
				s+=b[i];
			}
			if (set.contains(s)) {
				return ;
			}
			s=new String();
			for (int i=0;i<N;i++) {
				s+=b[i];
			}
			set.add(s);
			return ;
		}
		number+=1;
		for (int i=0;i<N;i++) {
			temp = Arrays.copyOf(status, status.length);
			int c[] = Arrays.copyOf(b, b.length);
			if (a[nowPoint][i]==1&&temp[i]==false) {
				temp[i] =true;
				c[number-1]=i;
				countPattern(a,number,temp,c,i,N);
			}
		}
	}
}