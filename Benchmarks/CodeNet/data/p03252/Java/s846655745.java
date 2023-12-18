import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
        
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        String ans = "Yes";
        for(int i = 0; i < s.length(); i++){
            if(mapST.containsKey(s.charAt(i))){
                if(mapST.get(s.charAt(i)) != t.charAt(i)){
                    ans = "No";
                    break;
                }
            }else{
                mapST.put(s.charAt(i), t.charAt(i));
            }
            if(mapTS.containsKey(t.charAt(i))){
                if(mapTS.get(t.charAt(i)) != s.charAt(i)){
                    ans = "No";
                    break;
                }
            }else{
                mapTS.put(t.charAt(i), s.charAt(i));
            }
        }
        System.out.println(ans);
    }
}