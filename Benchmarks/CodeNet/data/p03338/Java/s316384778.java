import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		scan.close();
		String []a = S.split("");
		//Arrays.sort(a);
		ArrayList<String> list1 = new ArrayList<String>();
		//list1.add(a[0]);
		int max = 0;
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			check(list1, a[i]);
			cnt = 0;
			for(int j = 0; j < list1.size(); j++) {
				String t = list1.get(j);
				for(int l = i + 1; l < N; l++) {
					if(t.equals(a[l])) {
						cnt ++;
						if(max < cnt) {
							max = cnt;
						}
						break;
					}
				}
			}
			//System.out.println(i + " listsize " + list1.size() + " max " + max);
		}
		//System.out.println("listsize" + list1.size());
		System.out.println(max);
	}
	public static void check(ArrayList<String> list, String a) {
		for(int i = 0; i < list.size(); i++) {
			if(a.equals(list.get(i))) {
				return;
			}
		}
		list.add(a);

	}

}