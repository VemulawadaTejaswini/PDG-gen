import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int sortCount = 0;
	static int addValue = 1;
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.next());
		int[] A = new int[n];
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(scanner.next());
		}
		List<Integer> intervalList = new ArrayList<Integer>();
		shellSort(A, intervalList, n);
		System.out.println(intervalList.size());
		int ansCnt = 0;
		for(int i: intervalList){
			System.out.print(i);
			if(ansCnt < (intervalList.size() - 1)){
				System.out.print(" ");
			}else{
				System.out.println("");
			}
			ansCnt++;
		}
		System.out.println(sortCount);
		for(int i: A){
			System.out.println(i);
		}
	}

	private static void shellSort(int[] A, List<Integer> intervalList, int n){
		intervalList.add(addValue);
		while(true){
			addValue = (3 * addValue) + 1;
			if(n <= addValue){
				break;
			}
			intervalList.add(addValue);
		}
		Collections.reverse(intervalList);
		Iterator it = intervalList.iterator();
		while(it.hasNext()){
			int g = (int) it.next();
			insertionSort(A, g, n);
		}
	}

	private static void insertionSort(int[] A, int g, int n){
		for(int i = g; i < n; i++){
			int v = A[i];
			int j = i - g;
			while(j >= 0 && A[j] > v){
				A[j + g] = A[j];
				j = j - g;
				sortCount++;
			}
			A[j + g] = v;
		}
	}
}