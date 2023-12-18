import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		int n = sc.nextInt();

		ArrayList<Integer> bingoCard = new ArrayList<>();

		for(int i=0;i<9;i++) {
			int a = sc.nextInt();
			bingoCard.add(a);
		}

		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int b = sc.nextInt();
			for(int j=0;j<bingoCard.size();j++) {
				if(b==bingoCard.get(j)) {
					bingoCard.set(j, 0);
					break;
				}
			}
		}

		if((bingoCard.get(0)==0 && bingoCard.get(1)==0 && bingoCard.get(2)==0)||
			(bingoCard.get(3)==0 && bingoCard.get(4)==0 && bingoCard.get(5)==0)||
			(bingoCard.get(6)==0 && bingoCard.get(7)==0 && bingoCard.get(8)==0)||
			(bingoCard.get(0)==0 && bingoCard.get(3)==0 && bingoCard.get(6)==0)||
			(bingoCard.get(1)==0 && bingoCard.get(4)==0 && bingoCard.get(7)==0)||
			(bingoCard.get(2)==0 && bingoCard.get(5)==0 && bingoCard.get(8)==0)||
			(bingoCard.get(0)==0 && bingoCard.get(4)==0 && bingoCard.get(8)==0)||
			(bingoCard.get(2)==0 && bingoCard.get(4)==0 && bingoCard.get(6)==0)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
