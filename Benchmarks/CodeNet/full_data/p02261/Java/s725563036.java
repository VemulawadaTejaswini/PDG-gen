import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		String[] ar = new String[n];
		for (int i=0; i<n; i++) {
			ar[i] = sc.next();
		}
		String[] ar2 = new String[n];
		for (int i=0; i<n; i++) {
			ar2[i] = ar[i];
		}
		
		
		ar = bubbleSort(ar);
		ar2 = selectionSort(ar2);
		
		
		for (int i=0; i<n; i++) {
			out.print((i==0?"":" ")+ar[i]);
		}
		out.println();
		out.println("Stable");
		boolean F = true;
		for (int i=0; i<n; i++) {
			if (ar[i].equals(ar2[i])==false) {F=false; break;}
		}
		for (int i=0; i<n; i++) {
			out.print((i==0?"":" ")+ar2[i]);
		}
		out.println();
		out.println(F==true?"Stable":"Not stable");
	}
	
	static String[] bubbleSort (String[] ar) {
		boolean F = true;
		int j = 0;
		String temp;
		while (F==true) {
			F = false;
			for (int i=ar.length-1; i>=j+1; i--) {
				if (Character.getNumericValue(ar[i].charAt(1)) < Character.getNumericValue(ar[i-1].charAt(1))) {
					temp = ar[i];
					ar[i] = ar[i-1];
					ar[i-1] = temp;
					F = true;
				}
			}
			j++;
		}
		return ar;
	}
	
	static String[] selectionSort (String[] ar) {
		int min;
		String temp;
		for (int i=0; i<ar.length-1; i++) {
			min = i;
			for (int j=i; j<ar.length; j++) {
				if (Character.getNumericValue(ar[j].charAt(1)) < Character.getNumericValue(ar[min].charAt(1))) {
					min = j;
				}
			}
			temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
		}
		return ar;
	}
}

