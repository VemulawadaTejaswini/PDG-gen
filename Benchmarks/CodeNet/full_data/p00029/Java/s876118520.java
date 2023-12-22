import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		String line = scan.nextLine();
		String[] words = line.split(" ");
		int max = 0, longest = 0;
		String sMax = "", sLong = "";
		int len = words.length;
		int[] counts = new int[len];
		for(int i = 0; i < len; i++){
			if(longest < words[i].length()){
				longest = words[i].length();
				sLong = words[i];
			}
			for(int j = i+1; j < len; j++){
				if(words[i].equals(words[j])){
					counts[i]++;
					sMax = words[i];
				}
			}
		}
		System.out.printf("%s %s\n", sMax, sLong);
	}
}