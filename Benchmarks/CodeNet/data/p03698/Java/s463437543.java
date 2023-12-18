import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        Collection<Character> set = new HashSet<>();
        for (int i=0; i<S.length(); i++){
            set.add(S.charAt(i));
        }
        System.out.println(set.size() == S.length() ? "yes" : "no");
    }
}