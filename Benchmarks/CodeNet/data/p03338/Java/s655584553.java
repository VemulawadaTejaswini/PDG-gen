import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String word = input.readLine();
        int max = -1;
        for (int i = 1; i < n; i++) {
            max = Math.max(max, getDistinct(word.substring(0, i), word.substring( i)));
        }
        System.out.println(max);
    }

    public static int getDistinct(String word1 ,String word2){
        HashSet<Character> wordFreq1 = new HashSet<>();
        for (char c : word1.toCharArray()) {
            wordFreq1.add(c);
        }
        HashSet<Character> wordFreq2 = new HashSet<>();
        for (char c : word2.toCharArray()) {
            wordFreq2.add(c);
        }
        wordFreq1.retainAll(wordFreq2);
        return wordFreq1.size();
    }
}
