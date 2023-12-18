import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String st[] =  in.readLine().split(" ");
        Arrays.sort(st,Collections.reverseOrder());
        System.out.println(Integer.parseInt(st[0]+st[1])+Integer.parseInt(st[2])); 
    }
}