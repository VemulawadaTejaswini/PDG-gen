import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		list.sort(Comparator.reverseOrder());
		int count = 0;
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i) == list.get(i-1)) {
				continue;
			}else{
				count++;
			}
		}
		System.out.println(count + 1);
	}

}
