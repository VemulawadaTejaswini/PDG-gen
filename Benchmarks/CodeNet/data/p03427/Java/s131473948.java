import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int f = Integer.parseInt(n.substring(0,1));
        char[] cl = n.substring(1,n.length()).toCharArray();
        boolean chk9 = true;
        for(char c : cl){
            if(c != '9'){ 
                chk9 = false;
                break;
            }
        }
        System.out.println(chk9 ? (f+(n.length()-1)*9) : (f-1+(n.length()-1)*9));
    }
}
