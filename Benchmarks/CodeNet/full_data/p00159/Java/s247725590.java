import java.util.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){
		while(in.hasNext()){
			int n = in.nextInt();
			if(n == 0) return;
			int  ai = 0;
			double ab = 0.0;
			for(int i = 0; i < n; i++){
				int j = in.nextInt(), h = in.nextInt(), w =in.nextInt();
				if(Math.abs(22.0 - ab) > Math.abs(22.0 - calcBMI(h, w))){
					ab = calcBMI(h, w);
					ai = j;
				}
				if(Math.abs(22.0 - ab) == Math.abs(22.0 - calcBMI(h, w))){
					if(ai > j) ai = j;
				}
			}
			System.out.println(ai);
		}
	}

	double calcBMI(int h, int w){
		return (double) w * 10000 / h / h;
	}

}