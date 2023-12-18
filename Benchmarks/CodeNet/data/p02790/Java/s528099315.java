
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int min = Math.min(n, m);
	    int[] a = new int[min];
	    for (int i = 0; i < a.length; i++) {
			a[i] = min;
		}
	    
	    for (int i : a) {
			System.out.print(i);
		}
	    
	  }
	}