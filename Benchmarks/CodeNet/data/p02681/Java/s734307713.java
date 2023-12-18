import java.util.*;

public class Main {

    public Main() {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String T = scan.next();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) != T.charAt(i)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
	    Main main = new Main();
    }
}
