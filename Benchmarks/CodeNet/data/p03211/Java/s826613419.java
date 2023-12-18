import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		//		String [][] boad = new String[4][4];
		List <Integer> list = new ArrayList<Integer>();
		String s = sc.next();
		int answer = 0;
//		int in = Integer.parseInt(sc.next());
		for(int i = 0;i<s.length();i++){
			list.add(Integer.parseInt(s.substring(i,i+1)));
		}
		for(int i = 2;i<s.length();i++){
			int var = 0;
			var = list.get(i) + list.get(i-1)*10 +list.get(i-2)*100;
			var = Math.abs(753 - var);
			if(i==2){
				answer = var;
			}else{
				if(var<answer){
					answer = var;
				}
			}
		}
		int b = 0;
//		int c = 0;
		String d = null;
//		for(int i = 0;i<n;i++){
//			list.add(Integer.parseInt(sc.next()));
//		}
		
		System.out.println(answer);
		System.out.flush();
		sc.close();
	}
}