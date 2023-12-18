//第 4 問: ABC 087 B - Coinsi (200 点)
/*
 * dreamererasereraserdream
erasereraserdream
reraserdream
NO
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

      	scan.nextLine();

		int count =0;

		List<Integer> list = new ArrayList<Integer>();

		for (int i=0; i<N; i++) {

		   int hi =	scan.nextInt();
		   list.add(hi);

		}

		scan.close();


		for(int j=1; j<=N; j++) {

			int cnt =  1 + list.indexOf(j);
			System.out.print(cnt + " ");

		}

	}
}

