
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> p = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			p.add(sc.nextInt());
		}

		int num = 0;

		int small = n / 2;
		int big = small + 1;

		int endsmall = 0;
		int endbig = 0;

//		for(int i = 0; i < p.size(); i++){
//			System.out.print(p.get(i));
//		}
//		System.out.println();

		//big
		if(p.indexOf(big) < small -1){
			p.remove(p.indexOf(big));
			p.add(big);
			num++;
		}
		endbig = big;
//
//		for(int i = 0; i < p.size(); i++){
//			System.out.print(p.get(i));
//		}
//		System.out.println();

		while(endbig != n){
			endbig++;
			if(p.indexOf(endbig) != p.size()-1){
				p.remove(p.indexOf(endbig));
				p.add(endbig);
				num++;
			}
//			for(int i = 0; i < p.size(); i++){
//				System.out.print(p.get(i));
//			}
//			System.out.println();
		}

		//small
		if(p.indexOf(small) > small -1){
			p.remove(p.indexOf(small));
			p.add(0,small);
			num++;
		}

		endsmall = small;

		while(endsmall != 1){
			endsmall--;
			if(p.indexOf(endsmall) != 0){
				p.remove(p.indexOf(endsmall));
				p.add(0,endsmall);
				num++;
			}
//			for(int i = 0; i < p.size(); i++){
//				System.out.print(p.get(i));
//			}
//			System.out.println();
		}

		System.out.println(num);

	}

	static Integer searchIndex(List<Integer> p, int value){
		int index = 0;
		for(int i = 0; i < p.size(); i++){
			if(value == p.get(i)){
				index = i;
				break;
			}
		}
		return index;
	}

	static boolean ansCheck(List<Integer> p){
		boolean a =  true;
		for(int i = 0; i < p.size(); i++){
			if(p.get(i) != i+1){
				a = false;
				break;
			}
		}
		return a;
	}
}
