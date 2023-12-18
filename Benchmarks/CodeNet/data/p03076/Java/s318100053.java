import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] a = new Integer[5];
		
		for(int i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		int time = 0;
		
		Set<Integer> remove = new HashSet<Integer>();
		
		for(int i = 0; i < 5; i++) {
			List<Integer> temp = Arrays.asList(a);
			final int ae = i;
			if(temp.contains(a[i]) && temp.stream().filter(x -> a[ae] == x).count() != 1 && i != a.length-1) {
				time+=a[i]+(10-(a[i]%10));
				remove.add(a[i]);
				continue;
			}
			
			if(remove.contains(a[i]) && i == a.length-1) {
				time+=a[i];
				break;
			}
			
			if(a[i] % 10 == 0) {
				time+=a[i];
			}else{
				list.add(a[i]);
			}
		}
		
		list = sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			if(i != list.size()-1) {
				time+=list.get(i)+(10-(list.get(i)%10));
			}else{
				time+=list.get(i);
			}
		}
		
		System.out.println(time);

	}
	
	public static List<Integer> sort(List<Integer> list){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : list) {
			int one = String.valueOf(i).charAt(String.valueOf(i).length()-1) - '0';
			map.put(i, one);
		}
		
		List<Entry<Integer, Integer>> list_entries = map.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue())).collect(Collectors.toList());
        
       List<Integer> ae = new ArrayList<Integer>();
       
       for(Entry<Integer, Integer> e : list_entries) {
    	   ae.add(e.getKey());
       }
       
       return ae;
	}
}
