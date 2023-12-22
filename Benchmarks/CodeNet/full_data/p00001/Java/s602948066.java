import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
    	List<Integer> ans = new ArrayList<Integer>();
    	while(line!=null){
    		ans.add(Integer.parseInt(line));
    		line = br.readLine();
    	}
		Collections.sort(ans,new Comparator<Integer>(){
			public int compare(Integer a,Integer b){
				return a-b;
			}
		});
    	for(int i=0;i<3;i++){
    		System.out.println(ans.get(i));
    	}
	}
}