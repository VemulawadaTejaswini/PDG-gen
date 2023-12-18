import java.util.Scanner;

public class Main {
    
    private static final String[] HITACHI_KAMI = {
            "hi",
            "hihi",
            "hihihi",
            "hihihihi",
            "hihihihihi"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        System.out.println(isHitachi(s) ? "Yes" : "No");
        
    }

    private static boolean isHitachi(String s) {
        for(String nissei : HITACHI_KAMI) {
            if(nissei.equals(s)) {
                return true;
            }
        }
        return false;
    }

}
