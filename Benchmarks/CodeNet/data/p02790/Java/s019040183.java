import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] sl = new String[2];
        for(int i = 0; i < 2;i++){
            int a = sc.nextInt();
            String s = "";
            for(int j = 0; j < a; j++){
                s += a;
            }
            sl[i] = s;
        }
        Arrays.sort(sl);
        System.out.println(sl[0]);
    }
}
 