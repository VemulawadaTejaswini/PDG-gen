import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		String result ="";

		switch (n){
			case 2:

				int x = sc.nextInt();
				int y = sc.nextInt();
				int h = sc.nextInt();
				int xx = sc.nextInt();
				int yy = sc.nextInt();
				int hh = sc.nextInt();

				if(Math.abs(hh-h)==Math.abs(yy-y)-Math.abs(xx-x)){
					System.out.println("0 0 " + Math.max(hh,h));
				}


			break;

			case 3:
			break;

			case 4:

			
			for(int i=0;i<4;i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int h = sc.nextInt();

			}





			break;
			default:

		}
		



		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();

		for(int i=0;i<n;i=i+2){
			oddList.add(sc.nextInt());
			evenList.add(sc.nextInt());
		}
		Collections.sort(oddList);
		Collections.sort(evenList);


		// System.out.println("log");
		// System.out.println(oddMap);
		// System.out.println(evenMap);

	}

}