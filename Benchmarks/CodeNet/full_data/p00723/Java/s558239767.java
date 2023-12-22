// AOJ 1142 列車の編成
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main{
	
	static String reverse(String ss) {
		StringBuffer s = new StringBuffer(ss);
		s.reverse();
		return s.toString();
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++) {
        	String arrive = sc.nextLine();
        	int n = arrive.length();
        	Set<String> train = new HashSet<String>();
        	for(int j = 1; j <= n - 1; j++) {
        		String f = arrive.substring(0, j);
        		String b = arrive.substring(j);        	
        		String fre = reverse(f);
        		String bre = reverse(b);
        		//System.out.println(f + " " + b + " " + fre + " " + bre);
        		train.add(f + b);
        		train.add(f + bre);
        		train.add(fre + b);
        		train.add(fre + bre);
        		train.add(b + f);
        		train.add(b + fre);
        		train.add(bre + f);
        		train.add(bre + fre);
        	}
        	
        	System.out.println(train.size());
        }
    }
}

