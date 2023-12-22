import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] table = new int[128];
        
        while(sc.hasNext()) {
            String s = sc.nextLine();
        
            for (int i = 0; i < s.length(); i++) {
                table[s.charAt(i)]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('a' + i) + " : " + (table['a' + i] + table['a' + i - 32]));
        }
    }
}
