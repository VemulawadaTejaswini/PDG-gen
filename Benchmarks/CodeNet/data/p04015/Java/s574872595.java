import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}

	static int n=gInt(),a=gInt(),
			v[]=IntStream.range(0,n).map(i->gInt()-a).sorted().toArray();
	static int res=-1;
	static void solve(int i,int j){
		if(j>0)
			return;
		if(i==n) {
			if(j==0)
				++res;
			return;
		}
		solve(i+1,j+v[i]);
		solve(i+1,j);
	}
	public static void main(String[]$){
		solve(0,0);
		System.out.println(res);
	}
}