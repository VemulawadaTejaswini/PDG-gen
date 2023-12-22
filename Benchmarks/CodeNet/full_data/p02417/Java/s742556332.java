import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		while(sc.hasNext()){
			str.append(sc.nextLine());
		}
		char[] moji = str.toString().toLowerCase().toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i = (int)'a'; i <= (int)'z'; i++){
			map.put((char)i,0);
		}
		for(char data: moji){
			if((int)'a' <= (int)data && (int)data <= (int)'z'){
				int temp = map.get(data);
				temp++;
				map.put(data,temp);
			}
		}
		for(char data: map.keySet()){
			System.out.printf("%c : %d\n",data, map.get(data));
		}
	}
}


