package aizuc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String data[] = reader.readLine().split(" ");
        int r = Integer.parseInt(data[0]);
        String c;
        String a;
        
        c = (String.format("%.6f", 2*r*Math.PI));
        a = (String.format("%.6f", r*r*Math.PI));

        sb
                .append(c)
                .append(" ")
                .append(a)
                .append("\n");
        System.out.println(sb);
    }
}