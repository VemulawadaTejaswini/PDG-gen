import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String s = buffer.readLine();
        if (s.charAt(s.length()-1)=='s')
            System.out.println(s+"es");
        else
            System.out.println(s+'s');
    }
}
