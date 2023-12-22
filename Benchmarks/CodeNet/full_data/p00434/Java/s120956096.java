import java.util.*;
import java.text.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static boolean[] ary;
    public static void main(String[] args) throws Exception {
        ary = new boolean[30];
        for (int i = 0; i < 28; i++) {
            ary[sc.nextInt()-1] = true;
        }
        
        for (int i = 0; i < 30; i++) {
            if (!ary[i]) {
                System.out.println(i+1);
            }
        }
    }
}