import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] strArray = S.toCharArray();
        int[] countChar = new int[26];
        for(int i = 0; i < strArray.length; i++){
            countChar[((int)strArray[i]) % 26] ++;
        }
        
        long total = 1;
        for(int i = 0; i < 26; i++){
            total *= countChar[i]+1;
        }
        total --;
        
        System.out.println(total%1000000007);
    }
}