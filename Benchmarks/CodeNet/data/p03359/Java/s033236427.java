import java.util.Scanner;

public class ABC096A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.print(a>b?a-1:a);
    }
}