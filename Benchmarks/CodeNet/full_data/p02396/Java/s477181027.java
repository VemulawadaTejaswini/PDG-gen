/**
 * Created by kaki on 2017/04/18.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int i = 0;
       
        for (int j = 0; scan.hasNext(); j++) {
            System.out.println("Case" + (j + 1) + ": " + number.set(j));
        }
    }
}