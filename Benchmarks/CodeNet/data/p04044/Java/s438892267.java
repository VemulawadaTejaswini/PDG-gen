import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int l = Integer.parseInt(line[1]);
		
		List<String> list = new ArrayList<String>();
		String input = null;
		
		String min = null;
		
		for(int i=0;i<n;i++){
			list.add(sc.nextLine());
		}
		
		min = list.get(0);
		for(int i=0;i<list.size()-1;i++){
			if(list.get(i).compareTo(list.get(i+1))>0){
				min = list.get(i+1);
			}
		}
		System.out.println(min);
	}
}