import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int shiftNum = 0;
        for (int i=0; i<N; i++) {
            shiftNum |= sc.nextInt();
        }

        int count = 0;
        while ((shiftNum & 1) == 0) {
            shiftNum = shiftNum >> 1;
            count++;
        }
        System.out.println(count);
    }
}
