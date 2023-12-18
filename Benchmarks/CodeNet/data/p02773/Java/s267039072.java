import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//n枚の投票用紙
		
		 Map<String, Integer>map=new HashMap<>();
		 
	        int max=0;
	        for(int i=0;i<n;i++) {
	            String s=sc.next();
	            if (map.containsKey(s)) {
	                map.put(s,map.get(s) + 1);
	 
	            }else{
	                map.put(s,1);
	            }
	            max=Math.max(max,map.get(s));
	        }
	 
	        List<String>array= new ArrayList<>();
	        for (Map.Entry<String, Integer>key: map.entrySet()) {
	            if (key.getValue() == max) {
	                array.add(key.getKey());
	            }
	        }
	        Collections.sort(array);
	        for (String s:array) {
	            System.out.println(s);
	    }
	        sc.close();
	}

}