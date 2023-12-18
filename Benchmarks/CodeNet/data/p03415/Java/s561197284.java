import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String ans = n.charAt(0)+"";
        n=in.next();
        ans+=n.charAt(1);
        n=in.next();
        ans+=n.charAt(2);
        
        System.out.println(ans);


        in.close();
    }
}
