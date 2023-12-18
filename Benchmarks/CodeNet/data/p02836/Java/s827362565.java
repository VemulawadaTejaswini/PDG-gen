import java.util.*;

public class Main{
    static int i = 0 , j = 0;
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        String s = input.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String res = sb.toString();
        Set<Character> set = new HashSet<>();
        for(i =0 ; i < res.length();i++){
            if(res.charAt(i) == s.charAt(i)){
                continue;
            }
            else{
                if(j != 0)
                    set.add(res.charAt(i));
                else
                    j += 1;
            }
        }
        System.out.println(set.size());
    }
}