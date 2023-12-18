import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        main3(sc);
    }

    public static void main3(Scanner sc) {

    	int N = sc.nextInt();
        float[] all = new float[N];

        for (int i = 0; i < N; i++) {
        	all[i] = sc.nextFloat();
        }

        Arrays.sort(all);

        float value = (all[0] + all[1])/2;

        for (int i = 2; i < N; i++) {
        	value = (value + all[i])/2;
        }

        System.out.println(value);
    }

}