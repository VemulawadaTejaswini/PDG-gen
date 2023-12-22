import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> aSet = new HashSet<>();
        for (int i=0;i<k;i++) {
            int d = sc.nextInt();
            for (int j=0;j<d;j++) {
                aSet.add(sc.nextInt());
            }
        }
        int aInt = aSet.size();
        System.out.println(n-aInt);

    }
}
