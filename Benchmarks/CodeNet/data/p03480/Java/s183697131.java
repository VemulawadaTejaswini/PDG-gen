import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char c = s.charAt(0);
        int minRange = s.length();
        for(int i = 1; i < s.length(); i++){
            char currentC = s.charAt(i);
            if(c != currentC){
                int range = (i >= s.length() - i) ? i : s.length()-i;
                if(range < minRange){
                    minRange = range;
                }
                c = currentC;
            }
        }
        System.out.println(minRange);
    }
}
