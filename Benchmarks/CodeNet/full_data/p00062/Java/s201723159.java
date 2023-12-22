
import java.util.*;

public class Main {

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			for(int i = 0; i < s.length(); i++){
				list.add(s.charAt(i) - '0');
			}
			while(list.size() > 1){
				for(int i = 0; i <= list.size() - 2; i++){
					int num1 = list.get(i);
					int num2 = list.get(i + 1);
					int res = (num1 + num2) % 10;
					list2.add(res);
				}
				list.clear();
				for(int i = 0; i < list2.size(); i++){
					list.add(list2.get(i));
				}
				list2.clear();
				
			}
			System.out.println(list.get(0));
		}
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}