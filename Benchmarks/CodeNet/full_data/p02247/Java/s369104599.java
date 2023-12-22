import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String t = scan.next();
		String p = scan.next();

		nFind(t, p);

		scan.close();
		System.exit(0);
	}

	private static void nFind(String t, String p){
		for(int st = 0; st < t.length() - p.length()+1; st++) //t?????????-p?????????+1??????????¢??????????
			if(isEqual(t, p, st))
				System.out.println(st);
	}

	private static boolean isEqual(String t, String p, int st){
		for(int i = 0; i < p.length(); i++)
			if(t.charAt(st + i) != p.charAt(i))
				return false;
		return true;
	}
}