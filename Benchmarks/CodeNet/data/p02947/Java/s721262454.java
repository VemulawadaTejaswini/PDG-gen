import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        String[] s = new String[n];

        for(int i = 0;i < n;i++){
            s[i] = stdIn.next();
        }

        long count = 0L;

        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++) {
                if(permutation(s[i],s[j])) {
                    count++;
                }
            }
        }
        System.out.println(count);      
    }

    static boolean permutation(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        
        int[] letters = new int[256]; //文字コードの仮定;
        
        char[] s_array = s.toCharArray();  
        for(char c:s_array){
            letters[c]++;
        }
        
        for(int i=0;i<t.length();i++){
            int c = (int)t.charAt(i);
            if(--letters[c] < 0){
                return false;
            }
        }
        return true;
    }

}