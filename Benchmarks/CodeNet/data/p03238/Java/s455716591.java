import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(age == 1){
            System.out.println("Hello World");
        }else if(age == 2){
            System.out.println(a + b);
        }
    }
}