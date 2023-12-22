import java.util.Scanner;

public class Main {

	static int n;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			n=cin.nextInt();
			if(n==0)break;
			Pair[] p = new Pair[n];
			for(int i = 0;i<n;i++){
				String s[]=cin.next().split(",");
				double a = Double.parseDouble(s[0]);
				double b = Double.parseDouble(s[1]);
				p[i]=new Pair(a,b);
			}
			int max=0;
			for(int i = 0;i<n;i++){
				int cnt=0;
				for(int j = 0;j<n;j++){
					//if(i==j)continue;
					if(p[i].is(p[j])){
						cnt++;
					}
				}
				max=Math.max(cnt,max);
			}
			System.out.println(max);
		}
	}

}
class Pair{
	double x,y;
	Pair(double a,double b){
		x=a;y=b;
	}
	boolean is(Pair p){
		double a = (this.x-p.x)*(this.x-p.x);
		double b = (this.y-p.y)*(this.y-p.y);
		double dist = Math.sqrt(a+b);
		return dist<=2.0;
	}
}