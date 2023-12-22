import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			String[] s = new String[100];
			map = new HashMap<String,String>();

			sc.nextLine();
			for(int i=0;i<n;i++){
				String name = sc.nextLine();
				int len = 0;

				for(;name.charAt(len)==' ';len++);
				name = name.trim();
				s[len] = name;
				if(len != 0){
					map.put(name,s[len-1]);
				}
			}

			while(m-- > 0){
				String X = sc.next();
				sc.next(); sc.next();
				String op = sc.next();
				sc.next();
				String Y = sc.nextLine();
				Y = Y.substring(1,Y.length()-1);

				boolean flg = false;

				if(op.equals("child")) flg = map.get(X) != null && map.get(X).equals(Y);
				else if(op.equals("parent")) flg = map.get(Y) != null && map.get(Y).equals(X);
				else if(op.equals("sibling")) flg = map.get(X) != null && map.get(Y) != null && map.get(X).equals(map.get(Y));
				else if(op.equals("descendant")) flg = solve(X,Y);
				else if(op.equals("ancestor")) flg = solve(Y,X);

				System.out.println(flg ? "True" : "False");
			}
			System.out.println();
		}
	}

	private static HashMap<String,String> map;

	private static boolean solve(String from,String to){
		if(from.equals(to)) return true;
		if(map.get(from) == null) return false;

		return solve(map.get(from),to);
	}
}