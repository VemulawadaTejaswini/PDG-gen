import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> list = new HashMap<String,Integer>();
		String object = "MARCH";
		int num = sc.nextInt();
		String a[] = {"M","A","R"};
		String b[] = {"M","A","C"};
		String c[] = {"M","A","H"};
		String d[] = {"M","R","C"};
		String e[] = {"M","R","H"};
		String f[] = {"M","C","H"};
		String g[] = {"A","R","C"};
		String h[] = {"A","R","H"};
		String j[] = {"A","C","H"};
		String k[] = {"R","C","H"};
		
		ArrayList<String[]> com = new ArrayList<String[]>();
		com.add(a);
		com.add(b);
		com.add(c);
		com.add(d);
		com.add(e);
		com.add(f);
		com.add(g);
		com.add(h);
		com.add(j);
		com.add(k);
		
		for(int i=0;i<num;i++){
			String value = sc.next();
			String first = value.substring(0,1);
			if(object.contains(first)){
				if(!list.containsKey(first)){
					list.put(first, 0);
				}
				list.put(first , list.get(first) + 1);
			}
		}
		
		if(list.size() < 3){
			System.out.println(0);
		}else{
			long comb = 0;
			for(String[] obj : com){
				 long co = 1;
				for(String ob : obj){
					if(list.containsKey(ob)){
					co = co * list.get(ob);
					}else{
						co = 0;
					}
				}
				comb = comb + co;
			}
		}
	}
}