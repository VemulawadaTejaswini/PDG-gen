import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<String> strList2 = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	static HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
	public static void main(String[] args) {

		String str1 = sc.next();
		String[] strArray1 = str1.split("");

		String str2 = sc.next();
		String[] strArray2 = str2.split("");

		String strAns = "";

		int count=0;

		for(int i=0; i<str1.length(); i++) {
			if(strArray1[i].equals(strArray2[i])) {
			}
			else {
				strAns=str1.replace(strArray1[i], strArray2[i]);
				count++;
			}
		}
		System.out.println(count);
	}
}
