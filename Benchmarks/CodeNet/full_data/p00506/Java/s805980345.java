import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int[] list = new int[n];
		for(int i =0 ; i < n; i++) {
			list[i] = sc.nextInt();
			min = Math.min(list[i], min);
		}
		
		IN:for(int i = 1; i <= min; i++) {
			for(int j = 0; j < n; j++) {
				if(list[j] % i != 0) continue IN;
			}
			System.out.println(i);
		}
		
	}
}