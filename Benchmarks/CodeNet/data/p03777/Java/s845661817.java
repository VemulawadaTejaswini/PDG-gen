import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if (a.charAt(0) == b.charAt(0))
            System.out.println('H');
        else
            System.out.println('D');
    }
}
