import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> monster = new ArrayList<>();
		ArrayList<Integer> braver = new ArrayList<>();
		int count=0;
		for (int i = 0; i < n + 1; i++) {
			monster.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			braver.add(sc.nextInt());
		}

		for (int i = n-1; i >= 0; i--) {
			if (braver.get(i) >= monster.get(i + 1)) {
				int temp=braver.get(i)-monster.get(i+1);
		
				braver.add(i, temp);
				count+=monster.get(i+1);
				monster.add(i+1,0);

			} else {
				count+=braver.get(i);
				braver.add(i,0);
			}
			if (braver.get(i) >= monster.get(i) ){
				int temp=braver.get(i)-monster.get(i);
				
				braver.add(i, temp);
				count+=monster.get(i);
				monster.add(i,0);
				
			} else {
				count+=braver.get(i);
				braver.add(i,0);
			}

		}

		System.out.println(count);
	}
}
