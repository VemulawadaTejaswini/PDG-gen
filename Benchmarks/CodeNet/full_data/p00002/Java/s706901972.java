import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int a, b;
        String line;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        a += b;
        line = Integer.toString(a);
        System.out.println(line.length());
    }
}