import java.util.*;
public class Main {
    private static String S;
    private static HashMap<Character, ArrayList<String>> map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        map = new HashMap<>();
        ArrayList<String> listD = new ArrayList<>();
        listD.add("dream");
        listD.add("dreamer");
        ArrayList<String> listE = new ArrayList<>();
        listE.add("erase");
        listE.add("eraser");
        map.put('d', listD);
        map.put('e', listE);
        if(helper("")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    private static boolean helper(String currentStr) {
        if(S.equals(currentStr)) return true;
        if(S.length() < currentStr.length() + 4) return false;
        char nextChar = S.charAt(currentStr.length());
        if(!map.containsKey(nextChar)) return false;
        for(String str: map.get(nextChar)) {
            if(helper(currentStr + str)) {
                return true;
            }
        }
        return false;
    }
}
