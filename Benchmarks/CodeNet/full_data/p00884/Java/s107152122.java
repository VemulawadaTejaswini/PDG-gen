
import java.util.*;
public class Main {
	// 2307 start
	//2322 TLE
	
	HashMap<String, String []> data;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			String first = null;
			data = new HashMap<String, String[]>();
			for(int i = 0; i < n; i++){
				String [] input = sc.next().replaceAll("\\.", "").split(":");
				data.put(input[0], input[1].split(","));
				if(i == 0){
					first = input[0];
				}
			}
			HashSet<String> res = new HashSet<String>();
			String [] res1 = solve(first);
			for(String a: res1){
				res.add(a);
			}
			
			System.out.println(res.size());
			//debug
			
//			for(String s : data.keySet()){
//				System.out.println("debug " + s + " " + Arrays.toString(data.get(s)));
//			}
//			System.out.println("-----");
		}
	}

	private String [] solve(String str) {
		
		if(data.containsKey(str)){
			String [] array = data.get(str);
			ArrayList<String> list = new ArrayList<String>();  
			for(int i =0 ; i < array.length; i++){
				String [] res = solve(array[i]);
				for(int j = 0; j < res.length; j++){
					list.add(res[j]);
				}
			}
			data.put(str, list.toArray(new String[list.size()]));
			return data.get(str);
		}
		else{
			return new String[]{str};
		}
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}