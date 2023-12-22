import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int w, n, i, tmp;
		int L,R;
		int list[];

		w = sc.nextInt();
		n = sc.nextInt();

		sc.useDelimiter(",| |\\n");

		list = new int[w + 1];
		for(i = 0; i < w; i++){
			list[i + 1] = i + 1;
		}

		for(i = 0; i < n; i++){
			L = sc.nextInt();
			sc.skip(",");
			R = sc.nextInt();
			//System.out.println(L + "," + R);
			tmp = list[L];
			list[L] = list[R];
			list[R] = tmp;
		}

		for(i = 0; i < w; i++){
			System.out.println(list[i + 1]);
		}
		
	}
}