import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int l = scan.nextInt() + scan.nextInt();
        int r = scan.nextInt() + scan.nextInt();

        if(l>r) System.out.println("Left");
        else if(l<r) System.out.println("Right");
        else System.out.println("Balanced");
        
        scan.close();
        
    }
}