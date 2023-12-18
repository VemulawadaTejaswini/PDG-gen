import java.rmi.activation.ActivationGroup_Stub;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        double total = 0;

        int N = sc.nextInt();
        int M = sc.nextInt();
        for (int i = 0; i < N; i++) {
            al.add(sc.nextInt());
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            total += al.get(i);
        }

        for (int j = 0; j < N; j++) {
            if (al.get(j) >= (total/(4*M))) {
                count++;
            }
            else {
                count = count;
            }
        }

        if (count >= M) {
            System.out.println("Yes");
        }

        else {
            System.out.println("No");
        }
    }
}
