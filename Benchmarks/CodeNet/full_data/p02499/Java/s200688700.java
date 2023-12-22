import java.util.*;


public class Main {
    private final static int NUMOFALPABET = 26;
    private static int[] counter = new int[NUMOFALPABET];
    static boolean FLAG = false;
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for ( int i = 0; i < counter.length ; i++) {
            counter[i] = 0;
        }
        
        while (!FLAG) {//scanner.hasNext()) {
            String word = (scanner.next()).toLowerCase();
            countCharacter(word);
        }
        
        char c = 'a';
        for( int i = 0; i < counter.length; i++) {
            System.out.println(c++ + " : "+ counter[i] );
        } 

    }
    
    public static void countCharacter (String word) {
        for (int i = 0; i < word.length(); i++) {
            char target = word.charAt(i);
            if (target == '0') FLAG =true;
            if ('a' <= target && target <= 'z') {
                counter[target-'a']++;
            }
        }
    }
}