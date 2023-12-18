import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
	    int arr[] = new int[n];
	    int arr2[] = new int[m];
	    for(int i = 0 ; i < n ; i++) {
	    	arr[i] = scan.nextInt();
	    }
	    for(int i = 0 ; i < m ; i++) {
	    	arr2[i] = scan.nextInt();
	    }
	    Arrays.sort(arr);
	    Arrays.sort(arr2);
	    if(arr[arr.length-1] < arr2[0] && x < arr2[0]) {
	    	System.out.println("No War");
	    }else {
	    	System.out.println("War");
	    }
	    
	}
}	