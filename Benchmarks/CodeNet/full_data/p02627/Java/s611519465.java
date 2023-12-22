import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static Scanner r=new Scanner(System.in);
    public static void main(String[] args) {
        String ch=r.next();
        char c=ch.charAt(0);
        if(c>='a'&&c<='z') System.out.println('a');
        else System.out.println('A');
    }
}
