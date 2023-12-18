import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int N, L, tempi;
        int[] listc;
        String output, temps;
        String[] lists;

        N = sc.nextInt();
        L = sc.nextInt();

        lists = new String[N];
        listc = new int[N];
        for (int i = 0; i < N; i++) {
            lists[i] = sc.next();
            listc[i] = lists[i].charAt(0);
        }

        for (int i = 0; i < N; i++) {
            for (int j = N-1; j > i; j--) {
                if (listc[j] < listc[j-1]) {
                    tempi = listc[j];
                    listc[j] = listc[j-1];
                    listc[j-1] = tempi;

                    temps = lists[j];
                    lists[j] = lists[j-1];
                    lists[j-1] = temps;
                }
            }
        }

        output = "";
        for (int i = 0; i < N; i++) {
            output += lists[i];
        }

        out.println(output);


        
        
        sc.close();
    }
}