import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> ans = new HashMap<>();

        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++){
            if(ans.containsKey(s.charAt(i))){
                ans.put(s.charAt(i), ans.get(s.charAt(i)) + 1);
            } else {
                ans.put(s.charAt(i), 1);
            }
        }

        boolean flg = true;
        for(Map.Entry<Character, Integer> e : ans.entrySet()){
            if(e.getValue() != 2){
                flg = false;
                break;
            }
        }

        if(flg){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        return;
    }
}
