import java.util.Scanner;


public class Main {
	
	private int n;
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	
	public void solve(){
		Scanner scanner = new Scanner(System.in);
		
		double[] start = {0,0};
		double[] end = {100,0};
		n = scanner.nextInt();
		System.out.println(start[0]+" "+start[1]);
		koch(n,start,end);
	}
	
	public void koch(int i,double[] start,double end[]){
		
		if(i==0){
			System.out.println(end[0] + " "+end[1]);
			return;
		}
		double[] s = new double[2];
		double[] t = new double[2];
		double[] u = new double[2];
		for(int j=0;j<2;j++){
			s[j] = (2*start[j]+end[j])/3.0;
			t[j] = (start[j]+2*end[j])/3.0;
		}
		u[0]=(s[0]+t[0])/2 + Math.sqrt(3.0)*(s[1]-t[1])/2.0;
		u[1]=Math.sqrt(3.0)*(-s[0]+t[0])/2.0 +(s[1]+t[1])/2.0;
		koch(i-1, start,s);
		koch(i-1, s, u);
		koch(i-1, u, t);
		koch(i-1, t, end);	
	}
}

