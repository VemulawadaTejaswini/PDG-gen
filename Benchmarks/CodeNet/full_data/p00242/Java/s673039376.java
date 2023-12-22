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
		String ans;
		
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
			
			ans = "";
			count = 0;
			if(al.size() == 0){
				System.out.println("NA");
			}else{
				for(String s:al){
					ans += s+" ";
					count++;
					if(count == 5){
						break;
					}
				}
				System.out.println(ans.trim());
			}
		}
		
	}
	
	private static void mapSort() {
		ArrayList<String> tmp = new ArrayList<String>();
		int value = -1;
		
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
            	if(value == -1){
            		value = s.getValue();
            	}
            	
            	if(value == s.getValue()){
            		tmp.add(s.getKey());
            	}else{
            		value = s.getValue();
            		Collections.sort(tmp);
            		al.addAll(tmp);
            		tmp.clear();
            		tmp.add(s.getKey());
            	}
            }
        }
		
		if(tmp.size() > 0){
			if(!al.contains(tmp.get(0))){
				Collections.sort(tmp);
				al.addAll(tmp);
			}
		}
	}
}