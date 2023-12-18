import java.util.ArrayList;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();

		int W = sc.nextInt();

		char[][] grid = new char[H][W];

		ArrayList<Integer> h = new ArrayList<>();

		ArrayList<Integer> w = new ArrayList<>();

		boolean Hflag = false;

		boolean Wflag = false;

		for(int i=0;i<H;i++) {

			Hflag = false;

			String line = sc.next();

			for(int j=0;j<W;j++) {

				grid[i][j] = line.charAt(j);

				if(grid[i][j] == '#') Hflag = true;

			}

			if(Hflag == false) h.add(i);
		}

		for(int j=0;j<W;j++) {

			Wflag = false;

			for(int i=0;i<H;i++) {

				if(grid[i][j] == '#') Wflag = true;
			}

			if(Wflag == false) w.add(j);

		}

		int H_index = 0;

		int W_index = 0;

		int hh = -1;

		int ww = -1;

		boolean flag = false;

		for(int i=0;i<H;i++) {

			flag = false;

			if(H_index<h.size()) {

				hh = h.get(H_index);

				H_index++;

				//System.out.println("HH"+hh);
			}

			for(int j=0;j<W;j++) {

				/*if(W_index<w.size()) {

					ww = w.get(W_index);

					W_index++;

					//System.out.println("WW"+ww);
				}*/

				boolean flagW = false;

				for(int k=0;k<w.size();k++) {

					ww = w.get(k);

					if(j==ww) flagW = true;
				}

				if(i==hh) {

					flag = true;

					break;
				}

				if(!flagW) System.out.print(grid[i][j]);
			}

			if(flag == false) System.out.println();
		}

	}

}
