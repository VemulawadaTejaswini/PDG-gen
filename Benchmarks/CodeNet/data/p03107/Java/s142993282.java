import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<String> list = new ArrayList<String>();
		int flag = 0;
		for(int i = 0; i < s.length(); i++) {
			list.add(String.valueOf(s.charAt(i)));
		}

		for(int i = 0; i < list.size()-1; i++) {
			if(!list.get(i).equals(list.get(i+1))) {
				flag+=2;
				list.remove(i);
				list.remove(i);
				i = -1;

			}
		}
		System.out.println(flag);
	}
}