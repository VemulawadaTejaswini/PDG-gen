import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        if(equalsCharAmount(s, t)&&equalsCharPosition(s, t)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    static boolean equalsCharAmount(String a, String b){
        char[] aArray= a.toCharArray();
        char[] bArray = b.toCharArray();
        List<Character> aHash = new ArrayList<>();
        List<Character> bHash = new ArrayList<>();
        for(char c : aArray) if (!aHash.contains(c)) aHash.add(c);
        for(char c : bArray) if (!bHash.contains(c)) bHash.add(c);
        return aHash.size() == bHash.size();
    }

    static boolean equalsCharPosition(String a, String b){
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        for(int i = 0;i < a.length() - 1;i++){
            if(aChars[i] == aChars[i+1]){
                if(bChars[i] != bChars[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}