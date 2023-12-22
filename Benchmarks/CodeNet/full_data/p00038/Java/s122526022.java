import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main{
	
	public static ArrayList<Integer> sort(ArrayList<Integer> list){
		for (int i=0; i<list.size()-1;i++ ){
			for (int j=list.size()-1; j>i;j-- ){
				if(list.get(j) < list.get(j-1)){
					int t = list.get(j);
					list.set(j,list.get(j-1));
					list.set(j-1,t);
				}
			}
		}
		return list;
	}

	public static boolean hand_straight(ArrayList<Integer> list){
		if(list.get(0) == 1){
			if(list.get(1) == 10 && list.get(2) == 11 && list.get(3) == 12 &&
					list.get(4) == 13)return true;
		}
		for (int i=1; i<list.size(); i++){
			if(list.get(i) == list.get(i-1) + 1);
			else return false;
		}

		return true;
	}

	/** 
	 *ツ姪ーツづーツチツェツッツクツつキツづゥツδソツッツド 
	 * 
	 * @param list ツ偲ィツ札ツづーツ格ツ納ツつキツづゥツδ環スツト
	 * @return ツ姪ーツづ個鳴シツ前ツづーツ陛板つキ
	 */
	public static String check_poker(ArrayList<Integer> list){
		int base;
		int m_same = 1;
		int t_same = 1;
		int pair = 0;
		int count = 0;
		
		for(int i = 0; i < 4;i++){
			t_same = 1;
			base = list.get(i);
			count ++;
			for(int j = count;j < 5;j++){
				if(i != j){
					if(base == list.get(j)){
						t_same++;
					}
				}
			}
			if(t_same == 2)pair++;
			if(t_same > m_same)m_same = t_same;
		}
		
		list = sort(list);
		
		if(hand_straight(list) == true) return "straight";
		if(m_same == 4) return "four card";
		if(m_same == 3 && pair == 2) return "full house";
		if(m_same == 3) return "three card";
		if(pair == 2) return "two pair";
		if(pair == 1) return "one pair";
		return "null";
	}
	
	
	public static void print_poker(ArrayList<Integer> list){
		ArrayList <Integer> inp = new ArrayList<Integer>();
		
		for(int i=0;i<list.size()/5;i++){
			for(int j=0;j<5;j++){
				inp.add(list.get(i*5+j));
			}
			System.out.println(check_poker(inp));
			inp.clear();
		}

	}
		
	public static void main(String args[]) throws IOException{
		String str;
		ArrayList <Integer> inp = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			str = scan.next();
			String [] strAry = new String[str.length()];
			strAry = str.split(",");
			for(int j=0;j<strAry.length;j++){
				Pattern p = Pattern.compile("[0-9]*");
				Matcher m = p.matcher(strAry[j]);
				if(m.find()){
					int x = Integer.valueOf(m.group(0)).intValue();
					inp.add(x);
				}
			}
		}
		print_poker(inp);
	}
}