import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isFlag=false;
        String str = br.readLine();
        String strstr = str + str;
        String expect = br.readLine();
        if(strstr.matches(".*" + expect + ".*")) 
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}