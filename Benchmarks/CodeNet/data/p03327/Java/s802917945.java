import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ans = "";

        if(a >= 1000){
            ans = "ABD";
        } else {
            ans = "ABC";
        }

        System.out.println(ans);
    }
}
