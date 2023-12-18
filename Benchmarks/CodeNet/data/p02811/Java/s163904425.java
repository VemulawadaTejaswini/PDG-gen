import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        int k = put.nextInt();
        int z = put.nextInt();
        if ((k<=100 && k>=1 )&& (z >=1 && z<= 100000))
            if (k*500<z)
                System.out.println("Yes");
            else
                System.out.println("No");
            
    }
}