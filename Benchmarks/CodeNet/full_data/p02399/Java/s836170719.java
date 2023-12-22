import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int d=a/b;
        int r=a%b;
        float fa=a;
        float fb=b;
        float f=fa/fb;
        System.out.printf("6.2f\n", d+" "+r+" "+f);
        
    }
}