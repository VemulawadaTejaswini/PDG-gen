import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String temp = sc.nextLine();

        String[] tempArr = temp.split(" ");
        int A = Integer.parseInt(tempArr[0]);
        int B = Integer.parseInt(tempArr[1]);

        if (B % A == 0) {
            System.out.println(A + B);
        } else {
            System.out.println(B - A);

        }


    }

}
