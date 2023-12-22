
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       ArrayList<Integer> out = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            out.add(input.nextInt());
        }
        Collections.sort(out);
        System.out.println(out.get(out.size()-1));
        System.out.println(out.get(out.size()-2));
        System.out.println(out.get(out.size()-3));
    }
}