import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] first = splitInt(sc.nextLine(), " ");
//		int[] second = new int[first[1]];
//		for(int i=0; i<first[1]; i++) {
//			second[i] = Integer.parseInt(sc.nextLine());
//			System.out.println("1" + i);
//		}
		int[] first = new int[] {100,5};
		int[] second = new int[] {1,23,45,67,89};

		
		boolean check = true;
		for(int i=0; i<first[1]-1; i++) {
			try {
				if(second[i] == second[i+1]-1) {
					check = false;
					break;
				}
			}catch (Exception e) {
				check = false;
				break;
			}
		}
		if(check == false) {
			System.out.println(0);
			return;
		}
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> timesList = new ArrayList<Integer>();
		
		int firstStep = 0;
		int lastStep = second[0]-1;
		for(int i=0; i<=second.length; i++) {
			timesList = new ArrayList<Integer>();
			timesList.clear();
			timesList.add(1);
			timesList.add(1);
			int timesIndex = 2;
//			System.out.println(firstStep+ " f");
//			System.out.println(lastStep+ " l");
			for(int j=0; j<lastStep-firstStep-1; j++) {
				timesList.add(timesList.get(timesIndex-2)+timesList.get(timesIndex-1));
				timesIndex++;
			}
			list.add(timesList);
//			System.out.println(list.toString());
			try {
//				System.out.println(i+1);
				firstStep = second[i]+1;
				lastStep = second[i+1]-1;
			}catch (Exception e) {
				firstStep = second[first[1]-1] + 1;
				lastStep = first[0];
//				System.out.println(firstStep + "a");
//				System.out.println(lastStep + "b");
				continue;
			}
		}
		long result = 1;
		for(int i=0; i<list.size(); i++) {
//			System.out.println(result);
			result *= list.get(i).get(list.get(i).size()-1);
		}
//		System.out.println(result);
		System.out.println(result%1000000007);
	}
}