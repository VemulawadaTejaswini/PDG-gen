import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {

	int n = kbd.nextInt();
	int[] a = new int[n];
	int i = 0;
	for(; i<n; i++){
	    a[i] = kbd.nextInt();
	}
	for(; i>0; i--){
	    System.out.print(a[i-1]);
	    if(i-1 != 0) System.out.print(" ");
	    else System.out.println();
	}
    }
}