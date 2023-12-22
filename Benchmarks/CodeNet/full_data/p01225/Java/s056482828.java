package Rummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		String str = "";
		for (int i = 0; i < T; i++) {
			str = scan.nextLine();
			String[] num = str.split(" ");
			str = scan.nextLine();
			String[] rgb = str.split(" ");
			sort(num, rgb);
		}
	}

	private static void sort(String[] num, String[] rgb) {
		ArrayList<Integer> R = new ArrayList<Integer>();
		ArrayList<Integer> G = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		int cnt = 0;
		for(int i = 0; i < num.length; i++){
			if(rgb[i].equals("R")){
				R.add(Integer.parseInt(num[i]));
			}else if(rgb[i].equals("G")){
				G.add(Integer.parseInt(num[i]));
			}else{
				B.add(Integer.parseInt(num[i]));
			}
		}


		if(3 <= R.size() && R.size()%3 == 0){
			Collections.sort(R);
			cnt += numSearch(R, R.size());
		}

		if(3 <= G.size() && G.size()%3 == 0){
			Collections.sort(G);
			cnt += numSearch(G, G.size());

		}
		if(3 <= B.size() && B.size()%3 == 0){
			Collections.sort(B);
			cnt += numSearch(B, B.size());

		}

		if(cnt == 3){
			System.out.println("1");
		}else{
			System.out.println("0");
		}

	}


	private static int numSearch(ArrayList<Integer> r, int T) {
		int cnt = 0;
		for (int j = 0; j < T; j += 3) {
			if( r.get(j) == r.get(j+1) && r.get(j) == r.get(j+2) ) cnt +=1;
			if( r.get(j) == r.get(j+1)-1 && r.get(j) == r.get(j+2)-2 ) cnt +=1;
		}

		return cnt;

	}

}