import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        ArrayList<Integer> array = new ArrayList<Integer>(3);
        array.add(a);
        array.add(b);
        array.add(c);
        
        Collections.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        StringBuffer buf = new StringBuffer();
        for (Integer item : array) {
            buf.append(item).append(" ");
        }
        System.out.println(buf.toString().trim());
    }
}