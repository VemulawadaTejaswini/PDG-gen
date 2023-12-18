import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        if(n%1.08==0)System.out.println(n/1.08);
        else System.out.println(":(");
        scan.close();
    }
}