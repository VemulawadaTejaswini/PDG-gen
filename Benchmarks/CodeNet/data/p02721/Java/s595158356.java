import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// n：全日数　k：働く日数　c：働いた後働かない日数
		int n, k, c;
		String line = scanner.nextLine();
		n = Integer.parseInt(line.split(" ")[0]);
		k = Integer.parseInt(line.split(" ")[1]);
		c = Integer.parseInt(line.split(" ")[2]);
		
		char[] ch = scanner.nextLine().toCharArray();
		int i = 0;
		int num = 0;
		List<Integer> llist = new ArrayList<>();
		// 前から貪欲的に働く日を求める llist
		while(num < k) {
			if(ch[i] == 'o') {
				llist.add(i);
				i += c + 1;
				num++;
			}
			else {
				i++;
			}
		}
		
		i = n - 1;
		num = 0;
		List<Integer> rlist = new ArrayList<>();
		// 後ろから貪欲的に働く日を求める rlist
		while(num < k) {
			if(ch[i] == 'o') {
				rlist.add(i);
				i -= c + 1;
				num++;
			}
			else
				i--;
		}
		Collections.reverse(rlist);
		for(int j = 0; j < k; j++) {
			if(llist.get(j) == rlist.get(j))
				System.out.println(llist.get(j) + 1);
		}
		
		scanner.close();
	}

}
