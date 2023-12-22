import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	if (!sc.hasNext()) {
	    System.exit(0);
	}
	String[] words = sc.nextLine().split(" ");

	int often = 0;
	Map<String, Integer> wordMap = new HashMap<>();

	for (String word : words) {
	    cycleList(wordMap, word);
	}
	System.out.print(outOftenWord(wordMap) + " " + outMaxLengthWord(wordMap));

    }

    private static void cycleList(Map<String, Integer> map, String word) {
	boolean isThere = false;
	for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
	    if (entrySet.getKey().equals(word)) {
		map.put(word, entrySet.getValue() + 1);
		isThere = true;
	    }
	}

	if (!isThere) {
	    map.put(word, 1);
	}
    }

    private static String outMaxLengthWord(Map<String, Integer> map) {
	String maxWord = "";
	for (String word : map.keySet()) {
	    if (word.length() > maxWord.length()) {
		maxWord = word;
	    }
	}

	return maxWord;
    }

    private static String outOftenWord(Map<String, Integer> map) {
	String oftenWord = "";
	int count = 0;

	for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
	    if (entrySet.getValue() > count) {
		count = entrySet.getValue();
		oftenWord = entrySet.getKey();
	    }
	}

	return oftenWord;
    }
}