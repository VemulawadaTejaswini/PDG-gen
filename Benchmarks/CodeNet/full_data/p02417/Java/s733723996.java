import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        while(scn.hasNextLine()) {
            sb.append(scn.nextLine());
        }
        int[] cnt = countChar(sb.toString());
        for(int i = 0; i < 26; i++) {
            System.out.println((char)('a' + i) + " : " + cnt[i]);
        }
    }
    
    private static int[] countChar(String str) {
        int[] cnt = new int[26];
        for(char elm : str.toLowerCase().toCharArray()) {
            if(Character.isAlphabetic(elm)) {
                cnt[elm - 'a']++;
            }
        }
        return cnt;
    }
}