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
		String ans = "";
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

		if(R.size()%3 != 0 || G.size()%3 != 0 || B.size()%3 != 0){
			System.out.println("0");
			return;
		}
		

		Collections.sort(R);
		cnt += numSearch(R);
		
		Collections.sort(G);
		cnt += numSearch(G);
		
		Collections.sort(B);
		cnt += numSearch(B);
		
		if(cnt == 3){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}


	private static int numSearch(ArrayList<Integer> r) {
		int i = 0;
		switch(r.size()){
		case 3:
			if( r.get(0) == r.get(1) && r.get(0) == r.get(2) ) return i++;
			if( r.get(0) == r.get(1)-1 && r.get(0) == r.get(2)-2 ) return i++;
			break;

		case 6:
			if( r.get(0) == r.get(1) && r.get(0) == r.get(2) ) i++;
			if( r.get(0) == r.get(1)-1 && r.get(0) == r.get(2)-2 ) i++;
			if( r.get(3) == r.get(4) && r.get(3) == r.get(5) ) i++;
			if( r.get(3) == r.get(4)-1 && r.get(3) == r.get(5)-2 ) i++;
			if(i == 2){
				return i;
			}else{
				return 0;
			}

		case 9:
			if( r.get(0) == r.get(1) && r.get(0) == r.get(2) ) i++;
			if( r.get(0) == r.get(1)-1 && r.get(0) == r.get(2)-2 ) i++;
			if( r.get(3) == r.get(4) && r.get(3) == r.get(5) ) i++;
			if( r.get(3) == r.get(4)-1 && r.get(3) == r.get(5)-2 ) i++;
			if( r.get(6) == r.get(7) && r.get(6) == r.get(8) ) i++;
			if( r.get(6) == r.get(7)-1 && r.get(6) == r.get(8)-2 ) i++;
			if(i == 3){
				return i;
			}else{
				return 0;
			}
		}

		return 0;
	}

}