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
        while (scan.next() == "0") {
            number.add(i);
            i++;
        }
    }
}