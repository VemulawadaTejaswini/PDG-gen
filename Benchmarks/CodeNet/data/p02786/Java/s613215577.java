import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		long hp = sc.nextLong();
		long attackCount = 0;
		long monsterCount = 1;
		while(true) {
			if(hp == 1) {
				attackCount += monsterCount;
				break;
			}
			attackCount += monsterCount;
			hp /= 2;
			monsterCount *=2;
		}
		System.out.println(attackCount);
	}
}