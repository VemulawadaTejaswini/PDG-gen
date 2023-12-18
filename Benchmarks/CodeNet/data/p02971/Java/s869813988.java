





import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main{
	
	public static void sort(List<Integer> list) {
	    sort(list, 0, list.size() - 1);
	}

	public static void sort(List<Integer> list, int from, int to) {
	    if (from < to) {
	        int pivot = from;
	        int left = from + 1;
	        int right = to;
	        int pivotValue = list.get(pivot);
	        while (left <= right) {
	            // left <= to -> limit protection
	            while (left <= to && pivotValue >= list.get(left)) {
	                left++;
	            }
	            // right > from -> limit protection
	            while (right > from && pivotValue < list.get(right)) {
	                right--;
	            }
	            if (left < right) {
	                Collections.swap(list, left, right);
	            }
	        }
	        Collections.swap(list, pivot, left - 1);
	        sort(list, from, right - 1); // <-- pivot was wrong!
	        sort(list, right + 1, to);   // <-- pivot was wrong!
	    }
	}
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 List<Integer> l=new ArrayList<Integer>();
	 
	 for(int i=0;i<N;i++) {
		 Integer temp=sc.nextInt();
		 l.add(temp);
		
	 }
	 
	 for(int i=0;i<N;i++) {
		 List<Integer> t=new ArrayList<Integer>(l);
		 t.remove(i);
		 sort(t);
		 System.out.println(t.get(N-2));
		 
	 }

	 
	 
 }
	


}