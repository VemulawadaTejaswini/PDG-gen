import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNext()) {
            int count = 0;
            s = sc.nextLine();
            if (s.equalsIgnoreCase("ssr") || s.equalsIgnoreCase("srs") || s.equalsIgnoreCase("rss") || s.equalsIgnoreCase("rsr")) {
                count = 1;
            }
            else if (s.equalsIgnoreCase("rrs") || s.equalsIgnoreCase("srr")) {
                count = 2;
            }
            else if(s.equalsIgnoreCase("rrr")) {
                count = 3;
            }
            else
                count = 0;
            System.out.println(count);                
        }
        
    }
}