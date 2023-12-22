import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		List<Integer> input = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			input = new ArrayList<Integer>();
			for(int j = 0; j < 10; j++){
				input.add(sc.nextInt());
			}
			List<Integer> l1 = removeList(input);
			input.removeAll(l1);
			Comparator<Integer> c = new Comparator<Integer>(){
				
				@Override
				public int compare(Integer o1, Integer o2){
					if(o1 < o2)
						return -1;
					else if(o1 == o2)
						return 0;
					else
						return 1;
				}
			};
			if(isSorted(l1, c) && isSorted(input, c))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
	static List<Integer> removeList(List<Integer> li){
		List<Integer> result = new ArrayList<Integer>();
		int lastIndex = 0;
		result.add(li.get(lastIndex));
		for(int i = lastIndex; i < li.size(); i++) {
			if(li.get(i) > li.get(lastIndex)) {
				result.add(li.get(i));
				lastIndex = i;
			}
		}
		
		return result;
	}
	
	static boolean isSorted(List<Integer> li, Comparator<Integer> c) {
		for(int i = 0; i < li.size() - 1; i++) {
			if(c.compare(li.get(i), li.get(i+1)) != -1) return false;
		}
		return true;
	}
}