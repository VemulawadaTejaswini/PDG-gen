import java.util.*;
import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		String[] w = new String[n];
		Arrays.setAll(w, i -> sc.next());
		List<String> list = new ArrayList<>(Arrays.asList(w));
		String result = "Yes";
		if(list.size() != list.stream().distinct().collect(Collectors.toList()).size()){
			result = "No";
		}else{
			for(int i=0; i<n-1; i++){
				if(list.get(i).charAt(list.get(i).length()-1) != list.get(i+1).charAt(0)){
					result = "No";
				}
			}
		}
		System.out.println(result);
	}
}
