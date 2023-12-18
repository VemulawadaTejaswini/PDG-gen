import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Collections;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < k; i++) {
            list.add(sc.nextInt());
        }
        
        for (int i = n; i < 10000; i++) {
            boolean b = false;
            for (int j = 0 ; j < list.size(); j++) {
                if (isContain(i, list.get(j))) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                System.out.println(i);
                return;
            }
        }
    }
    
    public static boolean isContain(Integer i, Integer j) {
        String s = i.toString();
        return s.indexOf(j.toString()) != -1;
    }
}

