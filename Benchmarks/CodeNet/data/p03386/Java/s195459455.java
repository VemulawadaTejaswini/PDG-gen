
import java.util.HashSet;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rn-sshawish
 */
public class Main{

    public static void main(String[] args) {
        HashSet<Integer> values = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int k = input.nextInt();
        int acopy = a;
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < k && acopy <= b; i++) {
            out.append(acopy).append("\n");
            values.add(acopy);
            acopy++;
        }
        int secandCopy = Math.max(a, b - k) + 1;
        for (int i = 0; i < k && secandCopy <= b; i++) {
            if (!values.contains(secandCopy)) {
                out.append(secandCopy).append("\n");
                values.add(secandCopy);
            }
            secandCopy++;
        }
        System.out.print(out);
    }
}
