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

		final int n = sc.nextInt();
		
		int number = -1;
		for(int i = 0; i < n; i++){
			boolean flag = true;
			
			char[] input = sc.next().toCharArray();
			for(int j = 0; j < n; j++){
				if(input[j] == 'x'){
					flag = false;
				}
			}
			
			if(flag && number == -1){
				number = i;
			}
		}
		
		for(int i = 0; i < 1; i++){
			System.out.println(number == - 1 ? (int)(Math.random() * n + 1) : number);
			
			final int ai = sc.nextInt();
		}
	}

}