
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<String> set = new HashSet<>();

        String ans = "None";

        for(int i = 0; i < s.length(); i++) {
            String tmp =  String.valueOf(s.charAt(i));
            if(set.size() == 26) {
            System.out.println(ans);
            }else {
            	
            for(int j = 0; j < 26; j++) {
                if(s.contains(tmp)) {
                    continue;
                }
                ans=tmp;
                System.out.println(ans);
                break;
            }
            }    
        }
    }
}