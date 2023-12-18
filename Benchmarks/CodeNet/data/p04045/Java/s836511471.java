import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] N = null;
        int K = 0;
        boolean[] a = new boolean[10];
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] elems = br.readLine().split(" ");
            N = new int[elems[0].length()];
            for (int i = 0; i < N.length; i++)
                N[i] = elems[0].charAt(i) - '0';
            K = Integer.parseInt(elems[1]);
            elems = br.readLine().split(" ");
            for (int i = 0; i < K; i++) {
                a[Integer.parseInt(elems[i])] = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < N.length; i++) {
            int trg = N[i];
            if (i == 0)
                for (int j = trg; j < a.length; j++){
                    if (a[j])
                        continue;
                    N[i] = j;
                 break;
                }
            else
                for (int j = 0; j < a.length; j++){
                    if (a[j])
                        continue;
                    N[i] = j;
                    break;
                }
        }
        for (int i: N)
            System.out.print(i);
        System.out.println();
    }
}
