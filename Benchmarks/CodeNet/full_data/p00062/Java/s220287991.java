import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//??????????????°
		String[] a = new String[10];
		ArrayList<String> b = new ArrayList<String>();
		String retu;
		ArrayList<Integer> num = new ArrayList<Integer>();


		//????????£?????????!!

		Scanner scan = new Scanner(System.in);

		//????????£??\
		while(scan.hasNext()){


		retu = scan.next();
		a = retu.split("");



			for(int i = 0 ; i < a.length ; i++){
				int m =  Integer.parseInt(a[i]);

			num.add(m);

			}
			for(int x = 0 ; x < 9; x++){

				for(int i = 0 ; i < num.size() - 1 ; i++){
					int gg = (num.get(i) + num.get(i + 1)) % 10;
					num.set(i,gg);


				}
				num.remove(num.size() - 1);
			}

			//????????¨???
					System.out.println(num.get(0));
		}

	}

}