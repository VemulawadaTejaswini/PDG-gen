import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int g = n / 2;
        int k = n % 2 == 0 ? (n / 2) : (n / 2 + 1);
        System.out.println(g * k);
    }
}