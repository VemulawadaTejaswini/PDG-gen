import java.util.*;

class Polygon{
	int m;
	int x[] = new int[10];
	int y[] = new int[10];

	Polygon(int m){this.m = m;}

	void toPointO(){
		int difx = x[0], dify = y[0];

		for(int i=0;i<m;i++){
			x[i] -= difx;
			y[i] -= dify;
		}
	}

	void turn(){
		int i,tmp;

		if(y[1] > 0){
			for(i=1;i<m;i++){
				tmp = x[i];
				x[i] = y[i];
				y[i] = -tmp;
			}
		}
		else if(x[1] < 0){
			for(i=1;i<m;i++){
				x[i] = -x[i];
				y[i] = -y[i];
			}
		}
		else if(y[1] < 0){
			for(i=1;i<m;i++){
				tmp = x[i];
				x[i] = -y[i];
				y[i] = tmp;
			}
		}
	}

	void reversePoint(){
		int tx[] = x.clone();
		int ty[] = y.clone();

		for(int i=0;i<m;i++){
			x[i] = tx[m-i-1];
			y[i] = ty[m-i-1];
		}
	}

	boolean equals(Polygon b){
		for(int i=0;i<m;i++)
			if(this.x[i] != b.x[i] || this.y[i] != b.y[i])
				return false;
		return true;
	}
}

public class Main{
	public static void main(String[] args){
		int i,j,n;
		boolean flg;
		Polygon a,b;
		Scanner scan = new Scanner(System.in);

		while((n=scan.nextInt()) != 0){
			a = new Polygon(scan.nextInt());
			for(i=0;i<a.m;i++){
				a.x[i] = scan.nextInt();
				a.y[i] = scan.nextInt();
			}
			a.toPointO();
			a.turn();

			for(i=1;i<=n;i++){
				b = new Polygon(scan.nextInt());
				for(j=0;j<b.m;j++){
					b.x[j] = scan.nextInt();
					b.y[j] = scan.nextInt();
				}

				flg = true;
				b.toPointO();
				b.turn();
				if(!a.equals(b)){
					b.reversePoint();
					b.toPointO();
					b.turn();
					if(!a.equals(b)) flg = false;
				}

				if(flg) System.out.println(i);
			}
			System.out.println("+++++");
		}
	}
}