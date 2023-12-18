import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "Yes";
        
        for(int i=0; i<s.length(); i++){
            if(i%2==0 && s.charAt(i)=='L'){
                ans = "No";
                break;
            }
            else if(i%2==1 && s.charAt(i)=='R'){
                ans = "No";
                break;
            }
        }
        
        System.out.println(ans);
    }
}