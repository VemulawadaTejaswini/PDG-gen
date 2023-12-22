import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        ArrayList<String> alist = new ArrayList<String>();
        try {
            int n = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++) {
                if (!(alist.contains(str = reader.readLine()))) {
                    alist.add(str);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(alist.size());
    }
}
