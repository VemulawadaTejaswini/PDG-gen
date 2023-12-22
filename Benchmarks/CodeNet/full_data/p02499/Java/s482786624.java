import java.util.*;


public class Main {
    private final static int NUMOFALPABET = 26;
    private static int[] counter = new int[NUMOFALPABET];

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for ( int i = 0; i < counter.length ; i++) {
            counter[i] = 0;
        }
        
        while (scanner.hasNext()) {
            String word = (scanner.next()).toLowerCase();
            countCharacter(word);
        }
        
        for( int i = 0; i < counter.length; i++) {
            int code = 'a'+i;
            System.out.println(code + " : "+ counter[code] );
        } 

    }
    
    private static void countCharacter (String word) {
        for (int i = 0; i < word.length(); i++) {
            char target = word.charAt(i);
            if ('a' <= target && target <= 'z') {
                counter[target-'a']++;
                System.out.println(counter[target-'a']);
            }
        }
    }
}