import java.util.*;
import java.util.Map.Entry;

public class Main {
	static HashMap<String,Integer> hm;
	static ArrayList<String> al;
	static String head;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,count;
		String[] token;
		
		while(true){
			n = Integer.valueOf(sc.nextLine());
			if(n == 0){
				break;
			}
			
			hm = new HashMap<String,Integer>();
			al = new ArrayList<String>();
			
			for(int i=0; i<n; i++){
				token = sc.nextLine().split(" ");
				for(int j=0; j<token.length; j++){
					if(hm.containsKey(token[j])){
						hm.put(token[j],hm.get(token[j])+1);
					}else{
						hm.put(token[j],1);
					}
				}
			}
			
			head = sc.nextLine();
			mapSort();
			al.sort(null);
			
			count = 0;
			if(al.size() == 0){
				System.out.println("NA");
			}else{
				for(String s:al){
					System.out.println(s);
					count++;
					if(count == 5){
						break;
					}
				}
			}
		}
		
	}
	
	private static void mapSort() {
		List<Map.Entry<String,Integer>> entries = 
				new ArrayList<Map.Entry<String,Integer>>(hm.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<String,Integer>>() { 
            @Override
            public int compare(
                  Entry<String,Integer> entry1, Entry<String,Integer> entry2) {
                return ((Integer)entry2.getValue()).compareTo((Integer)entry1.getValue());
            }
        });
		
		for (Entry<String,Integer> s : entries) {
            if(head.charAt(0) == s.getKey().charAt(0)){
            	al.add(s.getKey());
            }
        }
	}
}