import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a-1;

        int n = 1;

        while (a < b){
            a += c;
            n++;
        }
        System.out.println(n);
    }
}