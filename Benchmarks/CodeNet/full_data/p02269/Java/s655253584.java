import java.util.*;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		int num = sc.nextInt();
		for(int i = 0 ; i < num ; i++) {
			String str = sc.next();
			if(str.equals("insert")) {
				String add = sc.next();
				hs.add(add);
			}
			if(str.equals("find")) {
				String find = sc.next();
				if(hs.contains(find)) System.out.printf("yes\n");
				else System.out.printf("no\n");
			}
		}
		sc.close();
	}
}
