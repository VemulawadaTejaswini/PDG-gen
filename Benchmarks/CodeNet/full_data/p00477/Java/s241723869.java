import java.io.*;
import java.util.*;

public class TotalTimes {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int sec = 0;
        for (int i = 0; i < 4; i++)
            sec += Integer.parseInt(sc.nextLine());
        System.out.println(sec / 60);
        System.out.println(sec % 60);
    }
}