import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main{

	static Scanner s=new Scanner(System.in);

	public static void main(String __[]){
		input();
		solve();
	}

	static int		n, m, l, a[][], b[][];
	static long[][]	c;

	private static void input(){
		n=s.nextInt();
		m=s.nextInt();
		l=s.nextInt();
		a=new int[n][m];
		b=new int[m][l];
		c=new long[n][l];
		for(int i=0; i<n; i++){
			for(int k=0; k<m; k++){
				a[i][k]=s.nextInt();
			}
		}
		for(int k=0; k<m; k++){
			for(int j=0; j<l; j++){
				b[k][j]=s.nextInt();
			}
		}
	}

	private static void solve(){
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				for(int k=0; k<m; k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(Arrays.stream(c[i]).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
		}
	}
}