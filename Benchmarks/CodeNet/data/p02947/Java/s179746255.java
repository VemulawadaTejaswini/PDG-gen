import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] words = new String[n];
		for(int i = 0; i < n; i++) {
			words[i] = scanner.next();
		}
		// word and numerical representation
		Map<String, String> resultMap = new HashMap<String, String>();
		Map<Character, Integer> placeholder = new HashMap<Character, Integer>();
		Character[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
				'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		Set<Character> alphabetSet = new HashSet<Character>();
		placeholder.keySet().addAll(alphabetSet);
		alphabetSet.addAll(Arrays.asList(alphabets));
		for(int i = 0; i < n; i++) {
			// evaluate each word
			for(int k = 0; k < words.length; k++) {
				for(int j = 0; j < alphabets.length; j++) {
					placeholder.put(alphabets[j], new Integer(0));
				}
				for(int l = 0; l < words[k].length(); l++) {
					Integer charCount = placeholder.get(words[k].charAt(l));
					charCount = charCount.intValue()+1;
					placeholder.put(words[k].charAt(l), charCount);
				}
				// generate numeric representation
				Collection<Integer> values = placeholder.values();
				StringBuffer resultString = new StringBuffer();
				for(Integer count: values) {
					resultString.append(count);
				}
				resultMap.put(words[k], resultString.toString());
			}
		}
		Collection<String> mother = resultMap.values();
		int result = 0;
		List<String> compared = new ArrayList<String>(mother);
		String evaluated = null;
		for(int i = 0; i < compared.size(); i++) {
			evaluated = compared.get(i);
			for (int j = i+1; j < compared.size(); j++) {
				if(compared.get(j).equals(evaluated)) {
					result++;
					break;
				} else {
					continue;
				}
			}
		}
		System.out.println(result);
		
	}

}