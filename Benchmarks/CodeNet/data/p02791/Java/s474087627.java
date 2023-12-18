import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j=0;
        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int o=0; o<n ; o++) {
            a.add(sc.nextInt());
        }

        for (int i=0; i<n-1; i++) {
            j = i+1;
            if (a.get(i) < a.get(j)) {
                System.out.println(a.get(j));
            }
        }
    }
}
