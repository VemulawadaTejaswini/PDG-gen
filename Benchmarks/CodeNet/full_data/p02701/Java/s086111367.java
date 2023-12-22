import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //r(a, 0, "");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        HashSet<String> map = new HashSet<>();
        while(N -- > 0) {
            String s = in.next();
            map.add(s);
        }
        System.out.println(map.size());
    }

}
