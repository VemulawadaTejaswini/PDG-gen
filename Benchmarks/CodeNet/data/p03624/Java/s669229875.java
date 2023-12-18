import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] alp = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String s = sc.next();
        for(char c : alp){
            if(s.indexOf(c) == -1){
                System.out.println(c);
                return;
            }
        }
        System.out.println("None");
    }
}
