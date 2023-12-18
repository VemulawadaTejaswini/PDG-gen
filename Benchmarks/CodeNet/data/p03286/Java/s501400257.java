
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = -n;
       // int[] a = new int[n];
       List<Integer> list = new ArrayList<>();
       while (n != 0) {
           int a =Math.abs(n % 2);
           list.add(a);
           n = (int) Math.floor((double) n / (-2));
       }
       String s = "";
       for (int i = 0 ; i < list.size(); i++) {
           s += list.get(list.size()- i - 1);
       }
       if (n == 0) {
           System.out.println(0);
       } else {
           System.out.println(s);
       }



    }

}
