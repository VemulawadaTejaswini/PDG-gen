import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int length[] = new int[N*2];
        int i, niku = 0;
        for (i = 0 ; i < N*2 ; i++) {
            length[i] = sc.nextInt();
        } 
        Arrays.sort(length);
        for (i = 0 ; i < N ; i++) {
            // System.out.println(i);
            // System.out.println("length[2*i] " + length[2*i]);
            // System.out.println("length[2*i+1] " + length[2*i+1]);
            if (length[i] < length[2*i+1]) {
                niku += length[2*i];
            } else {
                niku += length[2*i+1];
            }
        }
        System.out.println(niku);
    }
}
