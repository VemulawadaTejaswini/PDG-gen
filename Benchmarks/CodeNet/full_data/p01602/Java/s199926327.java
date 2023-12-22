import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		boolean broken = false;
		int un_closed = 0;
		for(int i = 0; i < n; i++){
			final boolean open = sc.next().toCharArray()[0] == '(';
			final int num = sc.nextInt();
			
			if(broken){
				continue;
			}
			
			if(open){
				un_closed += num;
			}else{
				un_closed -= num;
				if(un_closed < 0){
					broken = true;
				}
			}
		}
		
		if(broken || un_closed > 0){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
		
	}

}