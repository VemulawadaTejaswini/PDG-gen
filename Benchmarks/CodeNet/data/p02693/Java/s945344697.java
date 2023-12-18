import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        if(b/k*k>(a-1)/k*k)
        System.out.println("OK");
        else
            System.out.println("NG");
    }
}
