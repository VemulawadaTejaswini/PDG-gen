import java.util.*;

public class Main {
    public static void main(String[] args)  throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        Double c = a*1.0/b;
        System.out.println(a/b + " " +a%b  + " " + c);
    }
}