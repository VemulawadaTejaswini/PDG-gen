import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] tmp = reader.readLine().split(" ");
        int triangleArea = Integer.parseInt(tmp[0]) * Integer.parseInt(tmp[1]) / 2;
        System.out.println(triangleArea);
    }
}
