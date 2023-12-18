import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int n = Integer.parseInt(line[0]);
		
		List<String> list = new ArrayList<String>();

		String min = "";
		
		for(int i=0;i<n;i++){
			list.add(sc.nextLine());
		}
		sc.close();
		
		Collections.sort(list);
		for(String col:list) {
			min += col;
		}
		System.out.println(min);
	}
}