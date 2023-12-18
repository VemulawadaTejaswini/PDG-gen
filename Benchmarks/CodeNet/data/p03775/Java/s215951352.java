import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bigger;
        ArrayList<Integer> divisorList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorList.add(i);
            }
        }
        int size = divisorList.size();
        if (size % 2 == 0) {
            bigger = divisorList.get(size / 2);
        } else {
            bigger = divisorList.get(size / 2);
        }
        String place = String.valueOf(bigger);
        System.out.println(place.length());
        sc.close();
    }
}