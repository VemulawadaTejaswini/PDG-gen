import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        for(int i=0;i<N;i++)
            total += sc.nextInt();
        System.out.println(total - 1);
    }
}