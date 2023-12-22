import java.util.Scanner;


class Main{
    public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n != 0) {
			int ua = 0;
			int ub = 0;
			for(int i=0; i<n; i++) {
				int va = sc.nextInt();
				int vb = sc.nextInt();
				if (va > vb) {
					ua += va+vb;
				} else if (vb > va) {
					ub += va + vb;
				} else {
					ua += va;
					ub += vb;
				}
			}
		}
		System.out.println(ua + " " + ub);
	}
}