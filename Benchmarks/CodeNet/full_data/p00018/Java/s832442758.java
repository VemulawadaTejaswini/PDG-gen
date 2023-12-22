import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int [] test = new int[5];
        for(int x = 0; x < 5; x++) {
            test[x] = sc.nextInt();
        }
        Arrays.sort(test);

        System.out.printf("%d %d %d %d %d\n", test[4], test[3], test[2], test[1], test[0]);
    }

}