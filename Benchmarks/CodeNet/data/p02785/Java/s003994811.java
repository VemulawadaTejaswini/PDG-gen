import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int monsters = sc.nextInt();
		int wazaCount = sc.nextInt();
		ArrayList<Integer> mh = new ArrayList<Integer>();


		while(sc.hasNext()) {
			mh.add(sc.nextInt());
		}

		int attack = 0;

		if(wazaCount >= monsters) {
			System.out.println(attack);
		}else if(wazaCount == 0){

			for(int i : mh) {
				attack += i;
			}

			System.out.println(attack);

		}else {

			Collections.sort(mh, Collections.reverseOrder());

			int index = wazaCount;

			for(int i = index; i < mh.size(); i ++) {
				int tmp = mh.get(i);
				attack += tmp;
			}

			System.out.println(attack);

		}
	}
}