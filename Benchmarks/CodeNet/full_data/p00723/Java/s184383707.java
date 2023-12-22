import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	String rev(String a){
		String ret = "";
		for(int i = a.length()-1;i >= 0; i--){
			ret += a.charAt(i);
		}
		return ret;
	}
	void run(){
		int n = sc.nextInt();
		for(int z = 0; z < n; z++){
			String in = sc.next();
			LinkedList<String> pattern = new LinkedList<String>();
			for(int i = 0;i < in.length();i++){
				String sub1 = in.substring(0,i);
				String sub2 = in.substring(i, in.length());
				String m1 = sub1+sub2;
				String m2 = rev(sub1)+sub2;
				String m3 = sub1+rev(sub2);
				String m4 = rev(sub1)+rev(sub2);
				if(!pattern.contains(m1)){
					pattern.add(m1);
				}
				if(!pattern.contains(m2)){
					pattern.add(m2);
				}
				if(!pattern.contains(m3)){
					pattern.add(m3);
				}
				if(!pattern.contains(m4)){
					pattern.add(m4);
				}
				m1 = rev(m1);
				m2 = rev(m2);
				m3 = rev(m3);
				m4 = rev(m4);
				if(!pattern.contains(m1)){
					pattern.add(m1);
				}
				if(!pattern.contains(m2)){
					pattern.add(m2);
				}
				if(!pattern.contains(m3)){
					pattern.add(m3);
				}
				if(!pattern.contains(m4)){
					pattern.add(m4);
				}
			}
/*			for(String pat:pattern){
				System.out.println("\t"+pat);
			}*/
			System.out.println(pattern.size());
		}
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}