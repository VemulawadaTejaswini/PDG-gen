import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = reader.readLine().split(" ");
        boolean b = false;
        for(int i = 1; i <= 3; i++){
            b = (Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) + i) % 2 == 1;
        }
        if(b){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
