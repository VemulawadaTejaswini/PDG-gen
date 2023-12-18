
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int Q = Integer.parseInt(br.readLine().trim());
        int[][] lr = new int[Q][2];
        Boolean[] isPrime = new Boolean[100001];
        List<Integer> isPrimeList = new ArrayList<>();
        for (int i = 0; i < lr.length; i++) {
            lr[i] = inputval();
        }
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        int x;
        for (int i = 2; i < (int) Math.sqrt(isPrime.length); i++) {
            x = 2;
            while (i * x < isPrime.length) {
                isPrime[i * x] = false;
                x++;
            }
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                isPrimeList.add(i);
            }
        }

        int[] isLike2017 = new int[100001];
        int count = 0;
        for (int i = 0; i < isLike2017.length; i++) {
            isLike2017[i] = 0;
        }
        for (int i = 0; i < isLike2017.length; i++) {
            if (isPrimeList.contains(i) && isPrimeList.contains((i + 1) / 2)){
                count++;
            }
            isLike2017[i] = count;

        }


        for (int i = 0; i < lr.length; i++) {
            System.out.println(isLike2017[lr[i][1]] - isLike2017[lr[i][0]-1]);
        }
    }


    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    static void array_sout(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void array_sout(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}