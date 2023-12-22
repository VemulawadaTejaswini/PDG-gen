import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(buffer.readLine());
        if (x == 0)
            System.out.println(1);
        else
            System.out.println(0);
        System.out.println(sb);
    }
}
