import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer count = 0;
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String word = s.next().toLowerCase();
		while(s.hasNext()){
			String input = s.next();
			if(input.equals("END_OF_TEXT")){
				break;
			}
			String[] word_list = input.split(" ");
			for(int i = 0; i < word_list.length; i++){
				String target = word_list[i].toLowerCase();
				if(word.equals(target)){
					count++;
				}
			}
		}
		s.close();
		System.out.println(count);

	}

}