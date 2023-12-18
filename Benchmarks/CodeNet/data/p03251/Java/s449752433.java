import java.util.*;

class Main {
	public static void main(String[] args) {
		boolean flag = true;
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X_ = sc.nextInt();
		int Y_ = sc.nextInt();
		for(int i=0;i<N;++i){
			x.add(sc.nextInt());
		}
		for (int i = 0; i < M; ++i) {
			y.add(sc.nextInt());
		}
		String ans = "War";
		int Z = Collections.max(x)+1;
		int ymin = Collections.min(y);
		if(X_<Z && Z<=Y_ && ymin>=Z){
			ans = "No War";
		}
		System.out.println(ans);
	}
}

