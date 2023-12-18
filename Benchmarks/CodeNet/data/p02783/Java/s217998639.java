import java.util.*;
import java.io.*;
public class solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String split = br.readLine();
        int totalPower = Integer.parseInt(split[0]);
        int power = Integer.parseInt(split[0]);
        int count = Math.ceil(totalPower/power);
        System.out.println(count);
    }
}