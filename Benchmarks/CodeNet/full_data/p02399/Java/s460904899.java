import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,x,y;
        double z;
        a = sc.nextInt();
        b = sc.nextInt();
        x = a / b;
        y = a % b;
        z = (double)a / b;
        System.out.println(x + " " + y + " " + String.format("%5f",z));
    }
}
