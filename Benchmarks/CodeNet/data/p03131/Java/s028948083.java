import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long bisket = 1;
		long money = 0;
		if(a >= b || b-a<=2) {
			// この場合は、ひたすらビスケットをたたく
			bisket += k;
		}else {
			for(int i =0;i < k;i++) {
				if(money >0) {
					// お金があったらビスケットと交換
					bisket += b;
					money =0;
					continue;
				}

				if(bisket >= a && i != k-1) {
					money++;
					bisket -= a;
				}else {
					bisket++;
				}
			}
		}
		System.out.println(bisket);
	}
}