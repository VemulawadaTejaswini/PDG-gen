import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();

        int suma = n * y;
        int sumb = n-y;
        int sumc = y-n;
        int sumd = n +y;

        System.out.println(Math.max(Math.max(Math.max(suma,sumb),sumc),sumd));

    }
}
