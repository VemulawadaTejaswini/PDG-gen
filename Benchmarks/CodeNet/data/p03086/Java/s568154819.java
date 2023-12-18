import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		s.close();
		Set<Character> map=new HashSet<Character>();
		char[ ]ch={'A','C','G','T'};
		for(char c : ch){
			map.add(c);
		}
		char[] tmp=str.toCharArray();
		int counter=0;
		int max=0;
		for(int i=0;i<tmp.length;i++){
			if(map.contains(tmp[i])||Character.isWhitespace(tmp[i])){
				counter++;
			}else{
				max=Math.max(max, counter);
				counter=0;
			}
		}
		System.out.println(max);
	}
}
