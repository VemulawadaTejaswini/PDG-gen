import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

import javax.print.attribute.standard.MediaSize.Other;
import javax.xml.bind.ParseConversionEvent;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		int[][] data = new int[M][2];
		
		for(int i = 0; i < M; i++){
			for(int j = 0; j < 2; j++){
				data[i][j] = sc.nextInt();
			}
		}
		
		int limit = 1;
		int count = 0;
		while(limit <= N){
			int max = Integer.MIN_VALUE;
			
			for(int i = 0; i < M; i++){
				if(data[i][0] <= limit && data[i][1] > limit){
					max = Math.max(max, data[i][1]);
				}
			}
			
			if(max == Integer.MIN_VALUE){
				System.out.println("Impossible");
				return;
			}else{
				limit = max + 1;
				count++;
			}
		}
		
		System.out.println(count);
	}

}