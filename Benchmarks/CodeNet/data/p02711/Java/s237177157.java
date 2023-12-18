import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) == '7'){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
    }
}