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

		ArrayList<Integer> palind = new ArrayList<Integer>();
		//LinkedList<String> seed = new LinkedList<String>();
		//seed.add("");
		//for(int i = 0; i <= 9; i++){
			//seed.add(i + "");
		//}
		
		for(int i = 0; i <= 9; i++){
			palind.add(i);
		}
		
		for(int i = 0; i <= 10; i++){
			for(int pre = 1; pre <= 100; pre++){
				String p_ = pre + "";
				StringBuilder sb = new StringBuilder();
				sb.append(p_);
				sb.reverse();
				palind.add(Integer.parseInt(pre + (i == 10 ? "" : i + "")  + sb.toString()));
			}
		}
		
		Collections.sort(palind);
		
		//System.out.println(palind);
		
		final int n = sc.nextInt();
		
		int b_search = Collections.binarySearch(palind, n);
		if(b_search >= 0){
			System.out.println(n);
			return;
		}
		
		int first = - (b_search + 1);
		int second = - (b_search + 2);
		
		if(second < 0){
			System.out.println(palind.get(first));
		}else{
			//System.out.println(palind.get(first) + " " + palind.get(second));
			
			if(Math.abs(n - palind.get(first)) < Math.abs(n - palind.get(second))){
				System.out.println(palind.get(first));
			}else{
				System.out.println(palind.get(second));
			}
		}
	}

}