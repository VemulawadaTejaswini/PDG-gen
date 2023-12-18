import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> v = new ArrayList<Integer>();
        double sum = 0, max = 0;

        for (int i=0; i<a; i++) {
            v.add(sc.nextInt());
        }


        for (int i=0; i<a; i++) {
            for (int j=0; j<a; j++) {
                sum += (v.at(i) + v.at(j)) / 2.0;

                if (sum > max) {
                    max = sum;
                }
            }
        }
    }
}