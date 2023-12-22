
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] english = new int[26];
		Arrays.fill(english,0);
		
		while(true){
			String str = stdIn.nextLine();
			System.out.println(str.length());
			if(str.length() == 0){
				break;
			}
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>='a' && 'z'>=str.charAt(i)){
					english[(int)str.charAt(i)-(int)'a']++;
				}
				else if(str.charAt(i)>='A' && 'Z'>=str.charAt(i)){
					english[(int)str.charAt(i)-(int)'A']++;
				}
			}	
		}
		for(int i=(int)'a';i<=(int)'z';i++){
			System.out.println((char)i+" : "+english[i-(int)'a']);
		}
	}

}