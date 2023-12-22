import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
		Scanner scan = new Scanner(System.in);
		int win = 0;
		while(scan.hasNext()) {
			int num = scan.nextInt();
			for(int i = 1;i < num + 1;i++) {
				int member = scan.nextInt();
				int fish = scan.nextInt();
				treeMap.put(member,fish);
				if(win < fish) {
					win = fish;
				}
			}
			break;
		}
		for(Integer fin : treeMap.keySet()) {
			if(treeMap.get(fin) == win) {
				System.out.println(fin + " " + treeMap.get(fin));
				break;
			}
		}
		scan.close();
	}
}

