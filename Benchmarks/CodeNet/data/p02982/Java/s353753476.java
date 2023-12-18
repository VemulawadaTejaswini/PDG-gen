import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Math;

class Main{
	public static void main(String args[]){
    	String reg = "[+-]?\\d+\\.0";
    	List<List<Integer>> hoge = new ArrayList<>();
      	
      	Scanner sc = new Scanner(System.in);
      	String str = sc.nextLine();
      	int n = Integer.parseInt(str.split(" ")[0]);
      	int d = Integer.parseInt(str.split(" ")[1]);
      	
      	for(int i = 0; i < n; i++) {
      		List<Integer> zahyo = new ArrayList<>();
      		str = sc.nextLine();
      		for(int j = 0; j < d; j++) {
      			zahyo.add(Integer.parseInt(str.split(" ")[j]));
      		}
      		hoge.add(zahyo);
      	}
      	Pattern p = Pattern.compile(reg);
      	int count = 0;
      	for(int i = 0; i < n; i++) {
      		for(int j = i+1; j < n; j++) {
      			//System.out.println(Math.sqrt(distance(hoge.get(i), hoge.get(j))));
      			Matcher matcher = p.matcher(String.valueOf(Math.sqrt(distance(hoge.get(i), hoge.get(j)))));
      			if(matcher.matches()) count++;
      		}
      	}
      	System.out.println(count);
    }
	
	public static double distance(List<Integer> p1, List<Integer> p2) {
		//int distance = 0;
		double sum = 0;
		for(int i = 0; i < p1.size(); i++) {
			sum += Math.pow(p1.get(i) - p2.get(i), 2);
		}
		return sum;
	}
}