import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(s.nextToken());
        int b = Integer.parseInt(s.nextToken());
        int yenA = (int)(a / 0.08);
        int yenB = (int)(b / 0.1);
        if (yenA == yenB) {
            System.out.println(yenA);
            return;
        }
        while (yenA != yenB && (int)(yenA * 0.08) == a && (int)(yenB * 0.1) == b) {
            if (yenA < yenB) yenA++;
            if (yenB < yenA) yenB++;
        }
        System.out.println(yenA == yenB ? yenB : -1);
    }
}