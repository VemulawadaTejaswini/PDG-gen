import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        boolean[] used = new boolean[10000];
        int i = 0;
        while(true) {
            i++;
            if(used[s]) {
                System.out.println(i);
                return;
            }
            used[s] = true;
            if(s % 2 == 0) {
                s /= 2;
            } else {
                s = 3 * s + 1;
            }
        }
    }
}