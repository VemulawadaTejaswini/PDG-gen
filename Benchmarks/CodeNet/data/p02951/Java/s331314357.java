import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int can = a - b;
        if(c - can > 0){
            System.out.println(c - can);
        } else {
            System.out.println(0);
        }

        return;
    }
}