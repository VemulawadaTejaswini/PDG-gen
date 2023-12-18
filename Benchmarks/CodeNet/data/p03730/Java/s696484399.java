import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int f = a % b;
        int t = a;
        while (true){
            if(t % b == c){
                System.out.println("YES");
                return;
            }
            t += a;
            if(f == t % b)break;
        }
        System.out.println("NO");
    }

}

