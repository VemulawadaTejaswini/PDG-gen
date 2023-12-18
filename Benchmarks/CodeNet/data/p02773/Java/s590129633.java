import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] A = new String[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.next();
        }
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (B.contains(A[i])) {
                continue;
            }else{
                B.add(A[i]);
            }
        }

        //System.out.println(B.toString());

        int[] count = new int[B.size()];
        
        for (int i = 0; i < N; i++) {
            count[B.indexOf(A[i])]++;
        }

        int max=0;
        for (int i = 0; i < count.length; i++) {
            if (count[i]>max) {
                max=count[i];
            }
        }

        for (int j = 0; j < count.length; j++) {
            if (count[j]==max) {
                System.out.println(B.get(j));
            }
        }
    }
}