import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a == 1){
            System.out.println("Hello World");
        }
        else{
            System.out.println((int)s.nextInt() + (int)s.nextInt());
        }
    }
}