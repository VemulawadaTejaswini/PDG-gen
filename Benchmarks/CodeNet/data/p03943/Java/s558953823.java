import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.next();
        int b = sc.next();
        int c = sc.next();
        if(a == b+ c || b == c +a || c == a+b){
            System.out.println("Yes");
        }else{
            System.out.pritnln("No");
        }        
    }
}
