import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = null;
        sc = new Scanner(System.in);
        String s = sc.nextLine();	
        String t = sc.nextLine();
        sc.close();	
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int count = 0;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] != ct[i]) {
                count +=1;
            } 
        }
        System.out.println(count);   
    }
    
}