import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private String str,index;
	
	Map<String ,List<String>> bookIndex;

	private void mainrun() {
		scan = new Scanner(System.in);

		bookIndex = new TreeMap<>();

		while(scan.hasNext()) {
			str = scan.next();
			index = scan.next();

			if(!bookIndex.containsKey(str)) {
				bookIndex.put(str, new ArrayList<String>());
			}
			bookIndex.get(str).add(index + " ");
		}

		bookIndex.forEach((k , v)->{
			System.out.println(k);
			int lastindex = v.size() - 1;

			v.sort((v1 , v2) -> Integer.parseInt(v1.trim()) - Integer.parseInt(v2.trim()));
			v.set(lastindex, v.get(lastindex).trim() + "\n");

			v.forEach(System.out::print);
		});
		scan.close();
	}
}
