import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int len = s.length();

        for (int i = 0; i<len; i++)
            System.out.print('x');
    }
}