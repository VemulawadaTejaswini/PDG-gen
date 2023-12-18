import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        List<Integer> divisors = new ArrayList<Integer>();

//        x = Integer.parseInt(   sc.nextLine());

        String temp = sc.nextLine();
        String[] tempArr = temp.split(" ");

        if (tempArr.length > 2) {
            x = Integer.parseInt(tempArr[0]);
            y = Integer.parseInt(tempArr[1]);
            z = Integer.parseInt(tempArr[2]);
        } else {
            x = 1;
            y = 1;
            z = 1;
        }

        int maxDivisor = 0;
        if (x > y) {
            maxDivisor = x / 2;
        } else {
            maxDivisor = y / 2;
        }

        for (int i = 1; i <= maxDivisor; i++) {
            if ((x % i) == 0 && (y % i) == 0) {
                divisors.add(i);
            }
        }

        if (z < divisors.size()) {
            System.out.println(divisors.get(divisors.size() - z));
        } else {
            System.out.println(1);
        }
    }
}
