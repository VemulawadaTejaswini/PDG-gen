
import java.util.*;
public class Main {
	// 2307 start
	
	HashSet<String> set;
	HashMap<String, String []> data, mem;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			String first = null;
			String [] fvalue = null;
			data = new HashMap<String, String[]>();
			for(int i = 0; i < n; i++){
				String [] input = sc.next().replaceAll("\\.", "").split(":");
				data.put(input[0], input[1].split(","));
				if(i == 0){
					first = input[0];
					fvalue = data.get(first);
				}
			}
			set = new HashSet<String>();
			HashSet<String> res = new HashSet<String>();
			mem = new HashMap<String, String[]>();
			for(int i = 0; i < fvalue.length; i++){
				String [] res1 = solve(fvalue[i]);
				for(int j = 0; j < res1.length; j++){
					res.add(res1[j]);
				}
			}
			
			System.out.println(set.size());
//			//debug
//			for(String s : set){
//				System.out.println(s);
//			}
		}
	}

	private String [] solve(String str) {
		
		if(mem.containsKey(str)){
			return mem.get(str);
		}
		
		if(data.containsKey(str)){
			String [] array = data.get(str);
			ArrayList<String> list = new ArrayList<String>();  
			for(int i =0 ; i < array.length; i++){
				String [] res = solve(array[i]);
				for(int j = 0; j < res.length; j++){
					list.add(res[j]);
				}
			}
			mem.put(str, list.toArray(new String[list.size()]));
			return list.toArray(new String[list.size()]);
		}
		else{
			set.add(str);
			return new String[]{str};
		}
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}