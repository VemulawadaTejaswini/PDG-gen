import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    int area = a*b;
    int cir = (a+b)*2;
    System.out.println(area + " " + cir);
    }
}
