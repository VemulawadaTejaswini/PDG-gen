import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int a = cin.nextInt();
        int b = cin.nextInt();

        if(1<=a && a<=9 && 1<=b && b<=9){
            System.out.println(a*b);
        }else{
            System.out.println(-1);
        }

    }
}