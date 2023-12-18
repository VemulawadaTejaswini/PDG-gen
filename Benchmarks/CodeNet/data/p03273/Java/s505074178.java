import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		String a[] = new String[h];
		String cw = "";
		String rw = "";
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < w; ++i)
			cw += '.';
		for (int i = 0; i < h; ++i) {
			a[i] = sc.next();
			if(!a[i].equals(cw)) {
				list.add(a[i]);
			}
		}
		for(int i = 0; i < list.size(); ++i)
			rw += '.';
		sc.close();
		List<String>list2 = new ArrayList<String>();
		for(int i = 0; i < w; ++i) {
			String tmp2 = "";
			for(int j = 0; j < list.size(); ++j) {
				tmp2 += list.get(j).charAt(i);
			}
			if(!tmp2.equals(rw))list2.add(tmp2);
		}
		String ans[] = new String[list.size()];
		for(int i = 0; i < list.size(); ++i) {
			String tmp2 = "";
			for(int j = 0; j < list2.size(); ++j) {
				tmp2 += list2.get(j).charAt(i);
			}
			ans[i] = tmp2;
		}
		for(String i : ans)
			System.out.println(i);
	}

}
