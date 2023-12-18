import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer>map=new TreeMap();
		String s=sc.next();
		for(;;) {
			int a=s.indexOf("ST");
			if(a==-1)break;
			s=s.substring(0,a)+s.substring(a+2);
		}
		System.out.println(s.length());
		}
	}
