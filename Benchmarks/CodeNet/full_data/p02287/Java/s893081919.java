import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		String line = br.readLine();

		String[] str = line.split(" ");
		int[] a = new int[size];
		for (int i=0; i<size; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		for (int i=0; i<size; i++) {
			System.out.print("node "+(i+1)+": key = "+a[i]+",");
			if (i != 0)
				System.out.print(" parent key = "+a[(i-1)/2]+",");
			if (i*2+1 < size)
				System.out.print(" left key = "+a[i*2+1]+",");
			if (i*2+2 < size)
				System.out.print(" right key = "+a[i*2+2]+",");
			System.out.println();
		}
	}
}