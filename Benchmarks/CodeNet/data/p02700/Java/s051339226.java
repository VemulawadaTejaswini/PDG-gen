
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tLife = sc.nextInt();
        int tAttackk = sc.nextInt();
        int aLife = sc.nextInt();
        int aAttack = sc.nextInt();
        boolean flg = false;

        while (true) {
        	flg = false;
        	aLife -= tAttackk;
			if(aLife <= 0) {
				flg = true;
				break;
			}

			tLife -= aAttack;
			if(tLife <= 0) {
				break;
			}

		}
        if(!flg) {
        	System.out.println("No");
        }else {
			System.out.println("Yes");
		}
		}
}

