import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] aArray = br.readLine().split(" ");
        int tmp = 0;
        for(String a : aArray){
            tmp += Integer.parseInt(a);
        }
        double avg = (double)tmp / n;
        double min = Math.abs(avg - Integer.parseInt(aArray[0]));
        int result = 0;
        for(int i = 1; i<n; i++){
            if(min > Math.abs(avg - Integer.parseInt(aArray[i]))){
                min = Math.abs(avg - Integer.parseInt(aArray[i]));
                result = i;
            }
        }
        System.out.println(result);
    }
}
