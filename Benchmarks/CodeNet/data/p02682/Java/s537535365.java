import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		if(a<k) {
			long somme = a;
			k-=a;
			if(b<k) {
				k-=b;
				System.out.println(somme-k);
			}else {
				System.out.println(somme);
			}
		}else {
			System.out.println(k);
		}
		sc.close();
	}

}
