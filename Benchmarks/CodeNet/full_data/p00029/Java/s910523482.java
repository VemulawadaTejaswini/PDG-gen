import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Integer> wordCnt = new HashMap<String, Integer>();
        String longWord = "";
        String freqWord = "";
        wordCnt.put(freqWord, 0);
        
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String[] strList = input.split(" ");
            
            for (int i = 0; i < strList.length; i++) {
                String tmpWord = strList[i];
                if (wordCnt.get(tmpWord) == null) {
                    wordCnt.put(tmpWord, 1);
                } else {
                    wordCnt.put(tmpWord, wordCnt.get(tmpWord)+1);
                }
                if (tmpWord.length() > longWord.length()) {
                    longWord = new String(tmpWord);
                }
                if (wordCnt.get(tmpWord) > wordCnt.get(freqWord)) {
                    freqWord = new String(tmpWord);
                }
            }
        }
        System.out.println(freqWord + " " + longWord);
    }
}