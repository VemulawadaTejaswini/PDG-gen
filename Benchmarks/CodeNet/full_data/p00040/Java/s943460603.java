import java.util.*;

public class Main{
	public static String decode(String str){
		String[] s = str.split(" ");
		List<String> check = new ArrayList<String>();
		for(String word : s){
			if( word.length() == 4 ){
				check.add(word);
			}
		}
		int[] thiz = {7,8,18};
		int[] that = {7,0,19};
		int mul = 0;
		int sur = 0;
	outer:	for(int i = 1; i < 26; i++){
			if( i%26 == i ){
			inner:	for(String word : check){
					int[] ch = new int[3];
					mul = i;
					sur = ((int)(word.charAt(0)-'a')-i*19)%26;
					for(int j = 0; j < ch.length; j++){
						ch[j] = (mul*(thiz[j])+sur)%26;
						if( ch[j] < 0 ){
							ch[j] += 26;
						}
						if( ch[j] == (int)(word.charAt(j+1)-'a') ){
							continue;
						} else {
							ch[j] = (mul*that[j]+sur)%26;
							if( ch[j] < 0 ){
								ch[j] += 26;
							}
							
							if( ch[j] != (int)(word.charAt(j+1)-'a') ){
								continue inner;
							}
						} 
					}
					break outer;
				}
			}
		}
	//	char[] alpha = new char[26];
		char[] refer = new char[26];
		for(int i = 0; i < 26; i++){
			int a = (i*mul+sur)%26;
			if( a < 0 ){
				a += 26;
			}
			refer[i] = (char)( 'a' + a );
		}
		Map<String, String> code = new HashMap<String, String>();
		for(int i = 0; i < 26; i++){
			code.put(Character.toString(refer[i]), Character.toString((char)('a'+i)));
		}
			
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < s.length; i++){
			char[] temp = s[i].toCharArray();
			for(int j = 0; j < temp.length; j++){
				if( Character.isLetter(temp[j]) ){
					ans.append(code.get(Character.toString(temp[j])));
				} else {
					ans.append(temp[j]);
				}
			}
			ans.append(" ");
		}
		ans.deleteCharAt(ans.length()-1);
		return ans.toString();
	}
			
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<String> result = new ArrayList<String>();
		
		int T = stdIn.nextInt();
		stdIn.nextLine();
		for(int i = 0; i < T; i++){
			String str = stdIn.nextLine();
			result.add(decode(str));
		}
		
		for(String sentence : result){
			System.out.println(sentence);
		}
	}
}