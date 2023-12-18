import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x < 100) {
            System.out.println(0);
            return;
        }
        String xx = Integer.toString(x);
        xx = xx.substring(xx.length() -2, xx.length());
        x = Integer.parseInt(xx);
        ArrayList<Integer> list = new ArrayList<>
            (Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        if(list.contains(Integer.valueOf(x))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}