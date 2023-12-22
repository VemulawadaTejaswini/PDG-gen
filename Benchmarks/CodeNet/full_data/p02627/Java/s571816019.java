import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        sc.close();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        if(Arrays.asList(alphabet).contains(a)){
            System.out.println("a");
        }else{
            System.out.println("A");
        }
    }
}