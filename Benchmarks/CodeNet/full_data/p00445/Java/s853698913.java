import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s = sc.next();
			int joi = 0;
			int ioi = 0;
			for(int i=0;i<s.length()-2;i++){
				String t = s.substring(i,i+3);
				if(t.compareTo("JOI")==0)joi++;
				if(t.compareTo("IOI")==0)ioi++;
			}
			System.out.println(joi);
			System.out.println(ioi);
		}
	}
}