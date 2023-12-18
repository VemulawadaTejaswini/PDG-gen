
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> mt = new ArrayList<Integer>();
		int n = Integer.parseInt(sc.next());
		int mt[] = new int[n];
		int count = 0;
		for(int i =0;i<n;i++) {
			mt[i] = Integer.parseInt(sc.next());
		}
		for(int j =0;j<n;j++) {
			if(mt[0] <= mt[j]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
