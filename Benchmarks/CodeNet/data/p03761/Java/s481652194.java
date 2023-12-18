import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int target = cin.nextInt();
		String list[] = new String[target];
		int tmp=100;
		int listNo =0;
		for(int i=0;i<target;i++){
			list[i] = cin.next();
			if(list[i].length()<tmp){
				tmp = list[i].length();
				listNo = i;
			}
		}
		// shortest word
		HashMap<Character,Integer> result = new HashMap<Character,Integer>();
		for(int j=0;j<list[listNo].length();j++){
			if(result.containsKey(list[listNo].charAt(j))){
				result.put(list[listNo].charAt(j), result.get(list[listNo].charAt(j))+1);
			}else{
				result.put(list[listNo].charAt(j), 1);
			}
		}
		HashMap<Character,Integer>tmp_map = new HashMap<Character,Integer>();
		for(int k=0;k<target;k++){
			if(k!=listNo){
				tmp_map.clear();
				for(int l=0;l<list[k].length();l++){
					if(tmp_map.containsKey(list[k].charAt(l))){
						tmp_map.put(list[k].charAt(l), tmp_map.get(list[k].charAt(l))+1);
					}else{
						tmp_map.put(list[k].charAt(l), 1);
					}
				}
				for(Character key:result.keySet()){
					if(tmp_map.containsKey(key)){
						if(result.get(key)>tmp_map.get(key)){
							result.put(key, tmp_map.get(key));
						}
					}else{
						result.remove(key);
					}
				}
			}
		}

		if(result.size()>0){
			System.out.println("");
		}else{
			Object output[] = result.keySet().toArray();
			Arrays.sort(output);
			for(int n=0;n<result.size();n++){
				for(int m=0;m<result.get(output[n]);m++){
					System.out.print(output[n]);
				}
			}
			System.out.println("");
		}

	}
}
