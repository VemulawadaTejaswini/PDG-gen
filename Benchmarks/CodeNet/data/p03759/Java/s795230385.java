import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ab = Math.abs(b-a);
        int cb = Math.abs(c-b);
        if(ab == cb){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
