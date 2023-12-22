import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();
        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n == 0 & x == 0) {
                for (int i=0; i<A.size(); i++) {
                    System.out.println(A.get(i));
                }
                break;
            }
            int count = 0;
            for (int i=1; i<n-1; i++) {
                for (int j=i+1; j<n; j++) {
                    for (int k=j+1; k<n+1; k++) {
                        if (i + j + k == x) {
                            count++;
                        }
                    }
                }
            }
            A.add(count);
        }
    }
}
