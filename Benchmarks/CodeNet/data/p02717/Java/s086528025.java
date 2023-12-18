import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = 1;//in.nextInt();
        for (int i = 1; i <= t; ++i){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println(z+" "+x+" "+y);
        }
    }
}