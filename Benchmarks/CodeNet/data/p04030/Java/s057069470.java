
import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sa = s.split("");
        String ans = "";
        for(int i = 0; i < sa.length; i++){
            if(sa[i] == "0" || sa[i] == "1"){
                ans += sa[i];
            }else{
                ans.substring(0, end - 1);
            }
        }
        System.out.println(ans);
    }
}