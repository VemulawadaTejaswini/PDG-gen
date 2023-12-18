//package beg_165;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		String[] l = b.split(" ");
		
		int[] list = new int[l.length];
		for (int i=0;i<l.length;i++) {
			list[i]=Integer.parseInt(l[i]);
		}
		int x = Math.min(list[1]-1, list[2]);
		
		int A = list[0];
		int B = list[1];
		
		int d = A*x/B;
		int e = x/B;
		e=e*A;
		System.out.println(d-e);
	}

}
