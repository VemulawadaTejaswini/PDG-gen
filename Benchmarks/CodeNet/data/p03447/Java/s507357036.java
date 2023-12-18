import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int X=scan.nextInt(),A=scan.nextInt(),B=scan.nextInt();
        int money;
        money = (X-A) % B;
    	System.out.println((X-A) % B);
    }
}