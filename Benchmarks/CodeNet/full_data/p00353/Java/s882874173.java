import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(),f=sc.nextInt();
        int b=sc.nextInt()-m;
        System.out.println(b<=f?b<0?0:b:"NA");
    }
}
