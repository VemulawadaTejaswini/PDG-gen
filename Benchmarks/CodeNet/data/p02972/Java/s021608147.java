import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String line = sc.nextLine();
        check(num, line);
    }

    public static void check(String num, String line) {

        String[] lines = line.split(" ");
        int[] vals = new int[lines.length];
        for(int i=0; i<lines.length; i++) {
            vals[i] = Integer.parseInt(lines[i]);
        }

        int zero = 0;
        for(int i=0; i<vals.length; i++) {
            zero+= vals[i];
        }
        if(zero == 0) {
            System.out.println(0);
            return;
        }
        int m = 0;
        int[] results = new int[Integer.parseInt(num)];
        for(int i=1; i<Integer.parseInt(num); i++) {
            if(vals[i-1] == i%2 && vals[i-1] > 0) {
                m++;
                results[i-1] = 1;
            }
        }
        StringBuffer tmp = new StringBuffer();
        if(m > 0) {
            System.out.println(m);
            for(int i=0; i<results.length; i++) {
                if(results[i] == 0) {
                    tmp.append(results[i] + " ");
                }
                if(results[i] == 1) {
                    System.out.print(tmp + "1");
                    tmp.delete(0, tmp.length());
                }
                //System.out.print(results[i] + " ");
            }
            return;
        }

        System.out.println(-1);
    }
}