import java.util.Scanner;

public class Main {           
    public static void main(String[]args) 
    {
        Scanner scan = new Scanner (System.in);

        int S = scan.nextInt();
        
        System.out.print(S / 3600);
        System.out.print(":");
        System.out.println(S % 3600 / 60);
        System.out.print(":");
        System.out.println(S % 3600 % 60);
    }   
}
