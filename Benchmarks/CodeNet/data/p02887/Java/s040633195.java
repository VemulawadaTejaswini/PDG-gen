import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String slimesStr = sc.nextLine();
        StringBuilder newStr = new StringBuilder();
        
        char lastchar = 0;
        for(int i = 0; i < slimesStr.length(); i++){
            char ci = slimesStr.charAt(i);
            if ( ci != lastchar ){
                newStr.append(String.valueOf(ci));    
            }
            lastchar  = ci;
        }
        
        System.out.println(newStr.length());
    }
}