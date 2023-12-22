import java.util.Scanner;

public class Main {

	static long gcd(int u,int v){
		int r = u%v;
		if(r == 0) {
			return v;
		}else {
			return gcd(v,r);
		}
	}


	void main() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long g = gcd(a,b);
			long l = a*(b/g);
			System.out.println(g + " " + l);
		}
	}

	public static void main(String[] args) {
		new Main().main();
	}

}

