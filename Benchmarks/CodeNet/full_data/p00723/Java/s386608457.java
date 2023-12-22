import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			String input = in.next();
			int cnt=0;
			int current = 1;//0-current   current+1-input.length
			for(current=1;current<input.length();current++){
				String a = input.substring(0,current);
				String b = input.substring(current);
				StringBuilder sb = new StringBuilder(a);sb.reverse();
				String c = sb.toString();
				sb = new StringBuilder(b);sb.reverse();
				String d = sb.toString();
				if(!map.containsKey(a+b)){
					cnt++;
					map.put(a+b,1);
				}
				if(!map.containsKey(b+a)){
					cnt++;
					map.put(b+a,1);
				}
				if(!map.containsKey(a+d)){
					cnt++;
					map.put(a+d,1);
				}
				if(!map.containsKey(d+a)){
					cnt++;
					map.put(d+a,1);
				}
				if(!map.containsKey(c+d)){
					cnt++;
					map.put(c+d,1);
				}
				if(!map.containsKey(d+c)){
					cnt++;
					map.put(d+c,1);
				}
				if(!map.containsKey(c+b)){
					cnt++;
					map.put(c+b,1);
				}
				if(!map.containsKey(b+c)){
					cnt++;
					map.put(b+c,1);
				}
			}
			System.out.println(cnt);
		}
	}
}