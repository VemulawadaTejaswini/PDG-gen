import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer array[] = new Integer[n];
        int alice = 0;
        int bob = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
      
        sc.close();
        Arrays.sort(array,Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                alice += array[i];
            } else {
                bob += array[i];
            }
        }

        System.out.println(alice - bob);
    }
}