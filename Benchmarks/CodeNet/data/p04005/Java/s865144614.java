import java.util.*;

public class Main {
    	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i=0; i<3; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		
		if(a[2]%2 == 1) System.out.println(a[0]*a[1]);
		else System.out.println(0);
	}
}