import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> input = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			input.add(sc.nextInt());
		}
		ArrayList<Integer> sorted = quicksort(input);
		int maxlength = 0;
		for(int j=sorted.size()-1; j>sorted.size()-k-1; j--) {
			maxlength = maxlength + sorted.get(j);
		}
		System.out.println(maxlength);
		for(int i=0; i<sorted.size(); i++) {
			System.out.println(sorted.get(i));
		}
	}
	
	static ArrayList<Integer> quicksort (ArrayList<Integer> l) {
		ArrayList<Integer> leftsort = new ArrayList<Integer>();
		ArrayList<Integer> rightsort = new ArrayList<Integer>();
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		int pivot = l.get(0);
		if(l.size()==1) return l;
		else {
			for(int i=1; i<l.size(); i++) {
				if(pivot<l.get(i)) rightsort.add(l.get(i));
				else leftsort.add(l.get(i));
			}
			if(leftsort.size()==0) {
				ArrayList<Integer> rightsorted = quicksort(rightsort);
				sorted.add(pivot);
				for(int i=0; i<rightsorted.size(); i++) {
					sorted.add(rightsorted.get(i));
				}
			}else if(rightsort.size()==0) {
				sorted = quicksort(leftsort);
                sorted.add(pivot);
			}else {
				sorted = quicksort(leftsort);
				ArrayList<Integer> rightsorted = quicksort(rightsort);
				sorted.add(pivot);
				for(int i=0; i<rightsorted.size(); i++) {
					sorted.add(rightsorted.get(i));
				}
			}
			return sorted;
		}
	}
	
}