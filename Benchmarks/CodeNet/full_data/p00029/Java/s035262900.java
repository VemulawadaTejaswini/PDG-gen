import java.io.*;
import java.util.HashMap;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] words = br.readLine().split(" ");
        
        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
        String maxLengthWord = "";
        for (int i = 0; i < words.length; i++) {
            if (wordMap.containsKey(words[i])) {
                wordMap.put(words[i], wordMap.get(words[i]) + 1);
            } else {
                wordMap.put(words[i], 1);
            }
            
            if (maxLengthWord.length() < words[i].length()) {
                maxLengthWord = words[i];
            }
        }
        
        // output
        int maxOftenCount = -1;
        String maxOftenWord = "";
        for (String key : wordMap.keySet()) {
            if (maxOftenCount < wordMap.get(key)) {
                maxOftenWord = key;
                maxOftenCount = wordMap.get(key);
            }
        }
        
        System.out.println(maxOftenWord + " " + maxLengthWord);
    }
}