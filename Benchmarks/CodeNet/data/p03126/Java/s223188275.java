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
			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			List <Integer> list = new ArrayList<Integer>();
			int total = 0;
	        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
			for(int i = 0;i<n;i++){
				int s = Integer.parseInt(sc.next()); 
				for(int j = 0;j<s;j++){
					list.add(Integer.parseInt(sc.next()));
				}
			}
			
			for(int j = 1;j<=m;j++){
				int c = 0;
				for(int k = 0;k<list.size();k++){
					if(j == list.get(k)){
						count.put(j,c+=1);
					}
				}
				if(count.get(j)!=null && count.get(j)>=n){
					total += 1;
				}
			}
			System.out.println(total);
			System.out.flush();
			sc.close();
		}
	}