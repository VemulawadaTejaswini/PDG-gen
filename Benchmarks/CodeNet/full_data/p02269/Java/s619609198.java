
import java.util.*;
import java.io.*;

/**
 * C
 */
public class Main {

    void run() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> dict = new HashSet<String>();

        for(int i=0; i<n; i++) {
            String doing = sc.next();
            String key = sc.next();
            if(doing.equals("insert")) {
                dict.add(key);
            } else {
                if(dict.contains(key)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }

        sc.close();

    }

    public static void main(String[] args) {
        new Main().run();
    }

}
