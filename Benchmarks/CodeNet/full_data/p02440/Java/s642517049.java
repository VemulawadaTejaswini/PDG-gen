import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int arrSize = in.nextInt(), array[] = new int[arrSize];
		for(int i = 0; i < arrSize; i++) {
			array[i] = Integer.parseInt(in.next());
		}

		int query = in.nextInt();
		for(int i = 0; i < query; i++) {
			int odr = Integer.parseInt(in.next()), begin = Integer.parseInt(in.next()), end = Integer.parseInt(in.next());

			if(odr == 0) {
				int min = array[begin];
				for(int j = begin + 1; j < end; j++) {
					min = Math.min(array[j], min);
				}
				out.println(min);
			}
			else {
				int max = array[begin];
				for(int j = begin + 1; j < end; j++) {
					max = Math.max(array[j], max);
				}
				out.println(max);
			}
		}
		out.flush();
		in.close();
	}

}

