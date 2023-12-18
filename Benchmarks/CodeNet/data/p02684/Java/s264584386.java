import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var n = scaner.nextInt();
        long k = scaner.nextLong();

        int[] towns = new int[n];
        for (int i = 0; i < n; i++) {
            towns[i] = scaner.nextInt();
        }

        var s = Math.floorMod(k, n);
        int current = towns[0];
        for(long l = 1; l<s-1; l++) {
            current =  towns[current-1];
        }

        System.out.println(towns[current-1]);

        scaner.close();
    }
}