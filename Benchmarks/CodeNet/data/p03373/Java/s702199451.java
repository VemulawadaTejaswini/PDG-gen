import java.util.Scanner;

class Main {
	int a,b,c;
	int x,y;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
	}
	void solve(){
		int cost = 0;
		if(a + b > 2 * c){
			while(x > 0 && y > 0){
				cost += 2 * c;
				x--;y--;
			}
			if(x > 0){
				if(a > 2 * c){
					while(x > 0){
						cost += 2 * c;
						x--;
					}
				} else {
					while(x > 0){
						cost += a;
						x--;
					}
				}
			} else if(y>0) {
				if(b > 2 * c){
					while(y > 0){
						cost += 2 * c;
						y--;
					}
				} else {
					while(y > 0){
						cost += b;
						y--;
					}
				}
			}
		} else {
			cost += a * x;
			x = 0;
			cost += b * y;
			y = 0;
		}
		System.out.println(cost);
	}
}