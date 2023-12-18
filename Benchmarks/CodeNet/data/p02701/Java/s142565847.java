import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i=0; i<num; i++) {
            set.add(sc.next());
        }

        System.out.println(set.size());
    }
}
