import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] x = new int[N];
		int kekka = 1;
		
		for(int i=0;i<N;i++) {
			x[i] = sc.nextInt();
			kekka = kekka * x[i];
		}
		
		if(Math.pow(10,18)>kekka) {
			System.out.println(kekka);
		}else {
			System.out.println("-1");
		}
		sc.close();
	}

}