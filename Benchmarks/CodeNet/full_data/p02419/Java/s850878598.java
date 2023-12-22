import java.util.Scanner;
import java.util.*;
public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String w = sc.nextLine();
		String t = "";
		String work = sc.nextLine();
		if(work != null){
			t += work;
			work = sc.nextLine();
		}
		t = t.toLowerCase();
		StringTokenizer st = new StringTokenizer(t," ");
		while(st.hasMoreTokens()){
			if(w.equals(st.nextToken())){
				count++;
			}
		}
		System.out.println(count);
	}
}