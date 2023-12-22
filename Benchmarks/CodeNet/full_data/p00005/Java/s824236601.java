import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> listG = new ArrayList<Integer>();
		List<Integer> listL = new ArrayList<Integer>();
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int g = gcd(a, b);
			int l = lcm(a, b, g);
			listG.add(g);
			listL.add(l);
		}
		Iterator<Integer> itG = listG.iterator();
		Iterator<Integer> itL = listL.iterator();
		while(itG.hasNext()){
			int g = itG.next();
			int l = itL.next();
			System.out.printf("%d %d\n", g, l);
		}
	}

	public static int gcd(int a, int b){
		if(b != 0)return gcd(b, a % b);
		else return a;
	}

	public static int lcm(int a, int b, int g){
		int v = a / g;
		int l = v * b;
		return l;
	}
}