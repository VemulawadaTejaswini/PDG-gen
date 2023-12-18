import java.util.*;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int s_front = s / 100;
        int s_back = s % 100;

        if (0 < s_front && s_front < 13) {
            if (0 < s_back && s_back < 13) {
                System.out.println("AMBIGUOUS");
            } else {
                System.out.println("MMYY");
            }
        } else {
            if (0 < s_back && s_back < 13) {
                System.out.println("YYMM");
            } else {
                System.out.println("NA");
            }
        }
    }
}




