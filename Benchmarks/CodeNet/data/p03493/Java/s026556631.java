import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int number = sc.nextInt();
			list.add(number);
		}
		
		int counter = 0;
		boolean listHasOdd = false;
		while(!listHasOdd) {
			for(int i = 0; i < list.size(); i++) {
				if(!(list.get(i) % 2 == 0)) {
					System.out.println(counter);
					listHasOdd = true;
					return;
				}
				int devidedNumber = list.get(i) / 2;
				list.set(i, devidedNumber);
			}
			counter++;
			
		}

		}

		
	}


