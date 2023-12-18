/**
 * Created by abhishek on 7/29/2016.
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int north= 0,east = 0,west  = 0,south = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == 'N')north++;
            if(str.charAt(i) == 'W')west++;
            if(str.charAt(i) == 'E')east++;
            if(str.charAt(i) == 'S')south++;
        }
        if(north != 0 && south == 0 || south != 0 && north = 0 || east != 0 && west = 0 || west != 0 && east == 0)
            System.out.print("No");
            else System.out.print("Yes");

    }
}
