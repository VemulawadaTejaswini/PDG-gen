import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        sc.close();
        if(n==m) System.out.println("Yes");
        else System.out.println("No");
    }
}