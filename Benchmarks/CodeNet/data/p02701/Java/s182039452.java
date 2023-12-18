import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int n = sc.nextInt();
        while(n-- != 0){
            String s = sc.nextLine();
            if(set.contains(s))
                continue;
            set.add(s);
        }
        System.out.println(set.size());
    }
}
