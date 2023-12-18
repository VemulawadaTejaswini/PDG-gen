import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String num;
		int num1;
		int num2;
		int num3;

		Scanner scan = new Scanner(System.in);
		num = scan.nextLine();
		String numbers[] = num.split(" ");
		ArrayList<Integer> numList1= new ArrayList<>();
		for(String number:numbers) {
			numList1.add(Integer.parseInt(number));
		}
		num = scan.nextLine();
		numbers = num.split(" ");
		ArrayList<Integer> numList2= new ArrayList<>();
		for(String number:numbers) {
			numList2.add(Integer.parseInt(number));
		}
		num = scan.nextLine();
		numbers = num.split(" ");
		ArrayList<Integer> numList3= new ArrayList<>();
		for(String number:numbers) {
			numList3.add(Integer.parseInt(number));
		}

		int N = scan.nextInt();
		ArrayList<Integer> b = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			int a = scan.nextInt();
			b.add(a);
		}

		for(int i = 0; i<N; i++) {
			for(int j = 0; j<3; j ++ )
				if(numList1.get(j) == b.get(i)) {
					numList1.set(j,0);
			};
			for(int j = 0; j<3; j ++ )
				if(numList2.get(j) == b.get(i)) {
					numList2.set(j,0);
			};
			for(int j = 0; j<3; j ++ )
				if(numList3.get(j) == b.get(i)) {
					numList3.set(j,0);
			};
		}

		if((numList1.get(0)==0&&numList1.get(1)==0&&numList1.get(2)==0) || (numList2.get(0)==0&&numList2.get(1)==0&&numList2.get(2)==0) || (numList3.get(0)==0&&numList3.get(1)==0&&numList3.get(2)==0) || (numList1.get(0)==0&&numList2.get(0)==0&&numList3.get(0)==0) || (numList1.get(1)==0&&numList2.get(1)==0&&numList3.get(1)==0) || (numList1.get(2)==0&&numList2.get(2)==0&&numList3.get(2)==0) || (numList1.get(0)==0&&numList2.get(1)==0&&numList3.get(2)==0) || (numList1.get(2)==0&&numList2.get(1)==0&&numList3.get(0)==0)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



	}
}
