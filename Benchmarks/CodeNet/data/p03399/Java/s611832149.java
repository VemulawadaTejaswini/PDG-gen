import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int sum = 0;
        if(a < b) sum += a;
        else sum += b;
        if(c < d) sum += c;
        else sum += d;

        System.out.println(sum);

        scan.close();
    
    }

}