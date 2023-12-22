import java.util.Scanner;
import java.time.Year;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a<30){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}