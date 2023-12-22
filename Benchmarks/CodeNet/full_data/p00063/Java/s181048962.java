import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count=0;
		while(sc.hasNext()){
			String s = sc.next();
			StringBuffer t = new StringBuffer(s);
			t.reverse();
			if(t.toString().compareTo(s)==0)count++;
		}
		System.out.println(count);
	}
}