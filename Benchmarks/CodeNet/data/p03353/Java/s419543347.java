import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;




class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	int K = sc.nextInt();

    	Comparator comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO 自動生成されたメソッド・スタブ
				return ((String)o1).compareTo((String)o2);
			}
    	 };

    	HashSet<String>set = new HashSet<String>();

    	for(int i = s.length(); i >= 1; i--){
    		for(int j = 0; j + i <= s.length(); j++){
    			String subs = s.substring(j, j + i);
    			set.add(subs);

    		}
    	}

    	List<String> list = new ArrayList<String>(set);
    	Collections.sort(list, comp);

    	System.out.println(list.get(K-1));

    }
}