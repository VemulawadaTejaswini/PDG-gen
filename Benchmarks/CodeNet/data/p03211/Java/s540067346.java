import java.util.*;
import java.io.*;

public class Main{
    public static void main(String... args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        
        int absMin = Math.abs(753 - Integer.parseInt(number.substring(0, 3)));
        for(int i = 1; i < number.length() - 2; i++){
            String cutNumber = number.substring(i, i + 3);
            int checknumber = Integer.parseInt(cutNumber);
            int checkAbs = Math.abs(753 - checknumber);
            if(absMin > checkAbs) absMin = checkAbs;
        }
        System.out.println(absMin);
    }
}