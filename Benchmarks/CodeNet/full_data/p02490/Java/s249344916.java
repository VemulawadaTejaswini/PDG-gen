import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] ia;

		while(true){
			ia = in.readLine().split(" ");
			int[] xy = new int[2];
			xy[0] = Integer.parseInt(ia[0]);
			xy[1] = Integer.parseInt(ia[1]);
			if(xy[0] == 0 && xy[1] == 0){
				break;
			}
			Arrays.sort(xy);
			System.out.println("" + xy[0] + " " + xy[1]);
		}
	}
}