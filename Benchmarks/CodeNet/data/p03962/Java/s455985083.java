import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int out = 1;
        if(a != b && b != c){
            out = 3;
        }else if(a == b && b != c || a != b && b == c){
            out = 2;
        }
        System.out.println(out);
    }
}