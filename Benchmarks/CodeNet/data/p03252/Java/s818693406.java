import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        for(int i = 0; i < S.length(); i++){
            list1.add(String.valueOf(S.charAt(i)));
            list2.add(String.valueOf(T.charAt(i)));
        }
        List<String> List1 = new ArrayList<String>(new HashSet<>(list1));
        List<String> List2 = new ArrayList<String>(new HashSet<>(list2));
        int ss = List1.size();
        int tt = List2.size();
        String ans;
        if(ss == tt){
            ans = "Yes";
        }else{
            ans = "No";
        }
        System.out.println(ans);
    }
}
