/**
 * Created by abhishek on 7/31/2016.
 */
import java.util.*;
import java.io.*;
public class A {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a > 0){
            System.out.println("Positive");
            return;
        }
        if(a <= 0 && b >= 0){
            System.out.println("Zero");
        return;
        }
        if(b < 0){
            int temp = b - a + 1;
            if(temp % 2 == 0)System.out.println("Positive");
            else System.out.print("Negative");
        }
    }
}
