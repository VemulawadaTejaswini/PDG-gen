import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		ArrayList<Integer> sList = new ArrayList<Integer>();
		ArrayList<Integer> hList = new ArrayList<Integer>();
		ArrayList<Integer> cList = new ArrayList<Integer>();
		ArrayList<Integer> dList = new ArrayList<Integer>();

		for(int i = 0;i < count;i++ ) {

			String mark = sc.next();
			int num = sc.nextInt();

			if(mark.equals("S")) {
				sList.add(num);
			} else if(mark.equals("H")) {
				hList.add(num);
			} else if(mark.equals("C")) {
				cList.add(num);
			} else if(mark.equals("D")) {
				dList.add(num);
			}
		}

		for(int i = 0;i < sList.size() - 1; i++) {
			for(int j = 0;j < sList.size() - 1; j++) {
				if(sList.get(j) > sList.get(j + 1)) {
					int x = sList.get(j);
					sList.set(j, sList.get(j + 1));
					sList.set(j +1, x);
				}
			}

		}
		for(int i = 0;i < hList.size() - 1; i++) {
			for(int j = 0;j < hList.size() - 1; j++) {
				if(hList.get(j) > hList.get(j + 1)) {
					int x = hList.get(j);
					hList.set(j, hList.get(j + 1));
					hList.set(j +1, x);
				}
			}

		}
		for(int i = 0;i < cList.size() - 1; i++) {
			for(int j = 0;j < cList.size() - 1; j++) {
				if(cList.get(j) > cList.get(j + 1)) {
					int x = cList.get(j);
					cList.set(j, cList.get(j + 1));
					cList.set(j +1, x);
				}
			}

		}
		for(int i = 0;i < dList.size() - 1; i++) {
			for(int j = 0;j < dList.size() - 1; j++) {
				if(dList.get(j) > dList.get(j + 1)) {
					int x = dList.get(j);
					dList.set(j, dList.get(j + 1));
					dList.set(j +1, x);
				}
			}

		}


		int numCount;
		for(int i = 1;i <= 13; i++) {
			numCount = 0;
			for(int j = 0;j < sList.size(); j++) {
				if(sList.get(j) == i) {
					numCount++;
				}
			}
			if(numCount == 0){
				System.out.println("S " + i);
			}


		}
		for(int i = 1;i <= 13; i++) {
			numCount = 0;
			for(int j = 0;j < hList.size(); j++) {
				if(hList.get(j) == i) {
					numCount++;
				}
			}
			if(numCount == 0){
				System.out.println("H " + i);
			}


		}
		for(int i = 1;i <= 13; i++) {
			numCount = 0;
			for(int j = 0;j < cList.size(); j++) {
				if(cList.get(j) == i) {
					numCount++;
				}
			}
			if(numCount == 0){
				System.out.println("C " + i);
			}
		}
		for(int i = 1;i <= 13; i++) {
			numCount = 0;
			for(int j = 0;j < dList.size(); j++) {
				if(dList.get(j) == i) {
					numCount++;
				}
			}
			if(numCount == 0){
				System.out.println("D " + i);
			}
		}


	}

}