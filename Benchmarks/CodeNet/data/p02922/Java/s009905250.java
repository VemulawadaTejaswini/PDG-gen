import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i < 22; i++) {
            int temp = i * a;
            if (temp >= b) {
                System.out.println(i);
                return;
            }
        }
    }
}