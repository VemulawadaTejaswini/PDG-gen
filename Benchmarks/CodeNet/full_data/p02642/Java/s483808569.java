import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = scanner.nextInt();
        var A = new ArrayList<Integer>(N);
        for(int i=0; i<N; i++)
            A.add(scanner.nextInt());

        A.sort(Comparator.naturalOrder());
        var numP = 0;
        while(A.size()!=0) {
            int p = A.get(0);
            numP++;
            A.remove(0);
            for(int j=1; j<A.size(); j++) {
                A.removeIf(integer -> integer%p == 0);
            }
        }
        System.out.println(numP);
    }
}