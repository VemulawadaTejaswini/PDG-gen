import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int[] a1 = new int[3];
            a1[0] = scanner.nextInt();
            a1[1] = scanner.nextInt();
            a1[2] = scanner.nextInt();
            Arrays.sort(a1);
            if((a1[0]^2 + a1[1]^2)== (a1[2]^2)) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}