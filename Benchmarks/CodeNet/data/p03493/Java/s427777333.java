import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int sum = 0;
        char[] si = new char[3];
        for (int i = 0; i < 3; i++) {
            si[i] = s.charAt(i);
            if (si[i] == Integer.toString(1).charAt(0)) {
                sum++;
            }
        }
        System.out.println(sum);


    }
}




