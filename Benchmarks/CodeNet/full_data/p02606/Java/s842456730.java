
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<String> strList2 = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	static HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
	public static void main(String[] args) {

		String str1 = sc.nextLine();
		String[] strArray = str1.split(" ");

		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);
		int c = Integer.parseInt(strArray[2]);

		int ans=0;

		for(int i=a; i<=b;i++) {
			if(i % c ==0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
