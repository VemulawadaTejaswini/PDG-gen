import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        while (a > 0 && c>0){
            c-=b;
            if(c > 0){
                a-=d;
            }else{
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
