import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double x = scan.nextDouble();
        int count  = 0;
        for(int i=(int)a; i<=b; i++){
            if(i%x == 0) count++;
        }

        System.out.println(count);

        scan.close();
    }
}