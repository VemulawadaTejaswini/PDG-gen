import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double res = 0;
        if(a % 2 == 0){
            res = 0.5;
        }else{
            res = ((a + 1) / 2) / a;
        }
        System.out.println(res);
    }
}
