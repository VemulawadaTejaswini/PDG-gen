import java.text.ParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		char[] c=sc.next().toCharArray();
		int count=0,ans=0;
		for (char d : c) {
			if(d!='A' && d!='C' && d!='G' && d!='T') {
				if(ans < count)ans=count;
				count=0;
				continue;
			}
			count++;
		}
		System.out.println(ans);
	}
}
