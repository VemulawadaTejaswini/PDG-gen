import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        if(S.length() == 2){
            System.out.println(S);
        }else {
            for(int i=2; i>=0; i--){
                System.out.print(S.charAt(i));
            }  
        }
    }
}

