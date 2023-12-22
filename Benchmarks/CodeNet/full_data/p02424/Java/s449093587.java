import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        long a = sc.nextLong();
        long b = sc.nextLong();

        sb.append(to32BitBinaryString(a & b)).append("\n");
        sb.append(to32BitBinaryString(a | b)).append("\n");
        sb.append(to32BitBinaryString(a ^ b)).append("\n");

        PrintWriter out = new PrintWriter(System.out);
        out.print(sb);
        out.flush();
        
        sc.close();
    }

    public static String to32BitBinaryString(long l) {
        String s = String.format("%32s", Long.toBinaryString(l)).replace(" ", "0");
        return s.substring(s.length() - 32, s.length());
    }
}

