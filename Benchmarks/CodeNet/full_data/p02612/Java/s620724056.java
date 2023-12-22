import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%1000 != 0)
            System.out.println((N/1000 + 1)*1000 - N);
        else
            System.out.println(0);
    }
}