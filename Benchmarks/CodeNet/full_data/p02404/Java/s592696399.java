import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> w = new ArrayList<Integer>();
		List<Integer> h = new ArrayList<Integer>();


		 for(int i=0;;i++){
			 h.add(i, scan.nextInt());
			 w.add(i, scan.nextInt());
			 if(w.get(i)==0 && h.get(i)==0) break;
		 }

		 for(int i=0;;i++){
			if(w.get(i)==0 && h.get(i)==0) break;
			if(/*w.get(i)<=100 &&*/ h.get(i)>=3) printFlame(w.get(i),h.get(i));
		 }
	}

	static void printFlame(int w,int h){

		for(int j=0 ; j < w  ;j++){
			System.out.print("#");
		}

		System.out.println();
		
		for(int i=0 ;i< h -2;i++){
			System.out.print("#");
			for(int j=0 ; j < w -2 ;j++){
				System.out.print(".");
			}
			System.out.println("#");
		}
		
		for(int j=0 ; j < w  ;j++){
			System.out.print("#");
		}

		System.out.println();
		System.out.println();

	}

}