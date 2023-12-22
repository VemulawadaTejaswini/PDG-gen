import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		System.out.println(euclid(a,b));
	}

	static int euclid(int a,int b){
		if (b == 0) {
			return a;
		}else {
			return euclid(b,a%b);
		}
	}
}