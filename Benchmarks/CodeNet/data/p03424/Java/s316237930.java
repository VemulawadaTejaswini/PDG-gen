import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // ひなあられの色定数
        final String PINK = "P";
        final String WHITE = "W";
        final String GREEN = "G";
        final String YELLOW = "Y";
        
        boolean hasFourColors = false;
        
        Scanner sc = new Scanner(System.in);
        
        // ひなあられの数
        int arareNum = sc.nextInt();
        
        while(sc.hasNext()) {
            String color = sc.next();
            
            System.out.println(color);
            
            if(color.equals(YELLOW)) {
                hasFourColors = true;
                break;
            }
        }
        
        String result = null;
        
        if(hasFourColors) {
            result = "Four";
        } else {
            result = "Three";
        }
        
        System.out.println(result);
        
    }
}
