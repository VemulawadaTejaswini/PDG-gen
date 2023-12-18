import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        Scanner Input=new Scanner(System.in);
        String a = Input.next(), b = Input.next();
        if(a.equals(b))
        System.out.println("H");
        else
        System.out.println("D");
    }
}