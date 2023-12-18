import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        long n = sc.nextInt();
        while(n-- != 0){
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            Arrays.sort(c);
            set.add(new String(c));
        }
        System.out.println(set.size());
    }
}
