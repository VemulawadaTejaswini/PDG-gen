import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

import java.util.Comparator;

class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		boolean f[] = new boolean[1000010];
		int[] s = new int[1000010];

		f[1] = true;

		for(int i = 1; i < 1000010; i *= 5){
			for(int j = 1; i * j < 1000010; j *= 3){
				for(int k = 1; i * j * k < 1000010; k *= 2){
					f[i * j* k] = true;
				}
			}
		}

		for(int i = 1; i < 1000010; i++) s[i] = s[i - 1] + (f[i]?1:0);

		while(in.hasNext()){
			int m = in.nextInt();
			if(m==0) return;
			int n = in.nextInt();
			System.out.println(s[n]-s[m-1]);
		}

	}
}