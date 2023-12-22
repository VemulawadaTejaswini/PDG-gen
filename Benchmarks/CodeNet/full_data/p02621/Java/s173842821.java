import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<String> strList2 = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	static HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
	public static void main(String[] args) {

		String str = sc.next();
		int a1,a2,a3;
		int ans;

		a1 = Integer.parseInt(str);
      
		a2 = a1*a1;
		a3 = a1*a1*a1;

		ans = a1+a2+a3;
		System.out.println(ans);

	}

}

