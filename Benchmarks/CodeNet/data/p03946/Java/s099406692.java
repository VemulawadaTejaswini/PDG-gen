import java.util.*;

public class Main {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		String arr[] = s.nextLine().split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < Integer.parseInt(arr[0]); i++){
			list.add(s.nextInt());
		}
		
		int diff = 0;
		int count = 0;
		
		int jnum;
		int b;
		
		for (int i = 0; i < list.size() - 1; i++) {
			jnum = 0;
			int a = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				b = list.get(j);
				if (a > b || b < jnum) {
					continue;
				} else if ((b - a) == diff) {
					count++;
				} else if ((b - a) > diff) {
					count = 1;
					diff = (b - a);
					jnum = b;
				}
			}
		}

		System.out.println("" + count);
	}
}