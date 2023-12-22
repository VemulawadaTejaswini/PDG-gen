import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		List<String> result = new ArrayList<String>();
		while(in.hasNext()){
			String input = in.next();
			String memo="";
			for(int i=0;i<input.length();i++){
				memo+=input.charAt(i);
				if(memo.equals("apple"))memo="peach";
				else if(memo.equals("peach"))memo="apple";
			}
			result.add(memo);
		}
		for(int i=0;i<result.size()-1;i++)System.out.print(result.get(i)+" ");
		System.out.println(result.get(result.size()-1));
	}
}