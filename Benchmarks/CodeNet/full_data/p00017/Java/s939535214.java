import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		Map<Character, Character> map=new HashMap<Character, Character>();
		for (int i = 0; i < 22; i++) {
			map.put((char)('a'+(i+4)),(char)('a'+i));
		}
		map.put('a', 'w');
		map.put('b', 'x');
		map.put('c', 'y');
		map.put('d', 'z');
		while((s=br.readLine())!=null){
			for (int i = 0; i < s.length(); i++) {
				if(map.containsKey(s.charAt(i))){
					System.out.print(map.get(s.charAt(i)));
				}else{
					System.out.print(s.charAt(i));
				}
				
			}
			System.out.println();
		}
	}

}